/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import modelos.Cliente;

/**
 *
 * @author Vinicius
 */
@ManagedBean
public class ControllerCliente {
    private Cliente cliente;
    private List<Cliente> lista;

    public ControllerCliente() {
        this.cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void salvar(){
        ClienteDAO dao = new ClienteDAO();
        dao.salvar(cliente);
    }
    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }
    @PostConstruct
    public void inicializar(){
        ClienteDAO dao = new ClienteDAO();
        lista = dao.listarCliente();  
    }
    
}
