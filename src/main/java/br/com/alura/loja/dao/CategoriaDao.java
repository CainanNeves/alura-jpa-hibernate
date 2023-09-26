package br.com.alura.loja.dao;

import br.com.alura.loja.model.Categoria;
import br.com.alura.loja.model.Produto;
import jakarta.persistence.EntityManager;

public class CategoriaDao {
    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria){
        em.persist(categoria);
    }

    public void atualizar(Categoria categoria){
        em.merge(categoria);
    }

    public void remover(Categoria categoria){
        categoria = em.merge(categoria);
        em.remove(categoria);
    }

    public Categoria buscarPorId(Long id){
        return em.find(Categoria.class, id);
    }
}
