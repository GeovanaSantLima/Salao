package br.com.salao.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public abstract class DAOGenerico <T>{
    private Session sessao;
    private Class classe;
    
    public DAOGenerico(Class classe){
        this.classe = classe;
        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvar(T t){
        this.sessao.beginTransaction();
        this.sessao.save(t);
        this.sessao.getTransaction().commit();
        this.sessao.close();
    }
    
    public void remover(T t){
        this.sessao.beginTransaction();
        this.sessao.delete(t);
        this.sessao.getTransaction().commit();
        this.sessao.close();
    }
    
    public void atualizar(T t){
        this.sessao.beginTransaction();
        this.sessao.update(t);
        this.sessao.getTransaction().commit();
        this.sessao.close();
    }
    
    public List listarTudo(T t){
        List <T> lista;
        
        this.sessao.beginTransaction();
        lista = this.sessao.createCriteria(classe).list();
        this.sessao.getTransaction().commit();
        this.sessao.close();
        
        return lista;
    }
    
    public List listar(String sql, String [] valores){
        List <T> lista;
        
        this.sessao.beginTransaction();
        
        Query query = this.sessao.createSQLQuery(sql).addEntity(classe);
        for (int i = 0 ; i< valores.length; i++){
            query.setString(i, valores[i]);
        }
        lista = query.list();
        
        this.sessao.getTransaction().commit();
        this.sessao.close();
        
        return lista;
   }
}
