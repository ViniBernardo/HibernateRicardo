/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import modelos.Cliente;

/**
 *
 * @author Vinicius
 */
public class Teste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNome("Vini");
        c.setEmail("v@");
        c.setTelefone("545454");
        ClienteDAO dao = new ClienteDAO();
        dao.salvar(c);
        
    }
}
