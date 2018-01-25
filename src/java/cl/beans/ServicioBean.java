/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import cl.entities.Categoria;
import cl.entities.Perfil;
import cl.entities.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnossur
 */
@Stateless
public class ServicioBean implements ServicioBeanLocal {
    
    @PersistenceContext(unitName="EjercicioMiercolesPU")
    private EntityManager em;
    

    @Override
    public List<Perfil> getPerfiles() {
        return em.createQuery("select p from Perfil p").getResultList();
    }

    @Override
    public List<Producto> getProductos() {
        return em.createQuery("select p from Producto p").getResultList();
    }

    @Override
    public List<Categoria> getCategorias() {
        return em.createQuery("select c from Categoria c").getResultList();
    }

    @Override
    public void save(Object o) {
        em.persist(o);
    }

    @Override
    public Producto buscar(int id) {
        return em.find(Producto.class, id);
    }

    @Override
    public Perfil buscarPerfil(int id) {
        return em.find(Perfil.class,id);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
