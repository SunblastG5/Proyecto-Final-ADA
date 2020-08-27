/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBiblioteca;

import java.util.*;
/**
 *
 * @author Usuario
 */
public class Gestionador {
    Administrador admin=new Administrador();
    Libro libro= new Libro();
    ArrayList<Libro> lib = new ArrayList<>();
    Iterator <Libro> it = lib.iterator();
    
    
    public void agregar_libro(String nombre, String autor, String categoria, String editorial, int pub_year){
        libro.setNombre(nombre);
        libro.setAutor(autor);
        libro.setCategoria(categoria);
        libro.setEditorial(editorial);
        libro.setPub_year(pub_year);
    }
    
    
    
    
    public void iniciar_sesion(){
        
    }
}
