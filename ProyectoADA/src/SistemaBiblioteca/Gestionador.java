/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBiblioteca;

import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Gestionador {
    ArrayList<Libro> listaDocumentos = new ArrayList();
    Iterator <Libro> iter=listaDocumentos.iterator();
    
    public Gestionador() {
        
    }
    
    public ArrayList<Libro> getListaDocumentos() {
        return listaDocumentos;
    }
     
   /* public void setListaDocumentos(ArrayList<Libro> listaDocumentos) {
        Gestionador.listaDocumentos = listaDocumentos;
    }*/
    ///
  
    
    /*
    public void agregar_libro(String nombre, String autor, String categoria, String editorial, int pub_year){
        libro.setNombre(nombre);
        libro.setAutor(autor);
        libro.setCategoria(categoria);
        libro.setEditorial(editorial);
        libro.setPub_year(pub_year);
    }
*/
    public void agregarDoc(Libro doc){
        boolean repetido=false;
        /*for(int i=0; i<listaDocumentos.size(); i++){
            if(iter.next().getCodigo()==doc.getCodigo()){
                repetido=true;
                JOptionPane.showMessageDialog(null, "no se puede agregar puesto que el nro de doc ya existe");
            }
        }*/
        if(repetido==false){
            listaDocumentos.add(doc);
            JOptionPane.showMessageDialog(null, "Documento agregado satisfactoriamente");
        }
        
    }
    
    public  void eliminarDoc(int cod){
        boolean existe=false;
        for( Libro d:listaDocumentos){
            if(d.getLib_id()==cod){
                existe=true;
                listaDocumentos.remove(d);
                JOptionPane.showMessageDialog(null, "Documento eliminado");
                 break;
            }
        }
        if(existe==false){
            JOptionPane.showMessageDialog(null, "no existe un documento con el codigo ingresado");
        }
        
    }
    /*public static void listar(){
        for(Libro d:listaDocumentos){
            System.out.println(d.toString());
        }
    }*/
    
    public ArrayList<Libro> buscar_libro(String nombre, String categoria, String autor, int opt){
        ArrayList<Libro> lista_lib = new ArrayList();
        Libro lib;
        switch(opt){
            case 1:
                for(int i=0; i<listaDocumentos.size();i++){
                    lib=listaDocumentos.get(i);
                    if (lib.getNombre().contains(nombre)){
                        System.out.println(lib.getNombre());
                        lista_lib.add(lib);
                    }
                }
            break;
            case 2:
                for(int i=0; i<listaDocumentos.size();i++){
                    lib=listaDocumentos.get(i);
                    if (lib.getCategoria().equals(categoria)){
                        System.out.println(lib.getCategoria());
                        lista_lib.add(lib);
                    }
                }
            break;
            case 3:
                for(int i=0; i<listaDocumentos.size();i++){
                    lib=listaDocumentos.get(i);
                    if (lib.getAutor().contains(autor)){
                        System.out.println(lib.getAutor());
                        lista_lib.add(lib);
                    }
                }
            break;
        }
        return lista_lib;
    }
}
