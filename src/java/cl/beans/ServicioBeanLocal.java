/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import javax.ejb.Local;
import cl.entities.*;
import java.util.List;


/**
 *
 * @author alumnossur
 */
@Local
public interface ServicioBeanLocal {
    List<Perfil> getPerfiles(); //se deben llamar get
    List<Producto> getProductos();
    List<Categoria> getCategorias();
    void save(Object o);
    Producto buscar(int id);
    Perfil buscarPerfil(int id);
}
