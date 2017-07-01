/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import modelos.Cliente;
/**
 *
 * @author Vinicius
 */
public class ClienteDAO {
    public void salvar(Cliente cliente){
        Session sessao = null;
        Transaction transacao = null;
        
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(cliente);
            transacao.commit();
        }catch(RuntimeException e){
            if(transacao != null){
                transacao.rollback();
            }
            throw e;
        }finally{
            sessao.close();
        } 
    }
    public List<Cliente> listarCliente(){
        Session sessao =  HibernateUtil.getSessionFactory().openSession();
        List<Cliente> lista = sessao.createQuery("from Cliente").list();
        
        sessao.close();
        
        return lista;
    }
}
