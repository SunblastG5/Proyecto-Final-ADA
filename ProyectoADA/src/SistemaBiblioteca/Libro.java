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
public class Libro {

    private int lib_id; 
    private String nombre;
    private String autor;
    private String categoria;
    private String editorial;
    private int pub_year;
    private String codigo;
    private Date fecha_reg;
    private String estado;

    public Libro(String nombre, String autor, String categoria, String editorial, int pub_year, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria= categoria;
        this.pub_year = pub_year;
        this.estado = estado;
    }
    
    public int getLib_id() {
        return lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPub_year() {
        return pub_year;
    }

    public void setPub_year(int pub_year) {
        this.pub_year = pub_year;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Date fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" + "lib_id=" + lib_id + ", nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", editorial=" + editorial + ", pub_year=" + pub_year + ", codigo=" + codigo + ", fecha_reg=" + fecha_reg + ", estado=" + estado + '}';
    }
    
    
    
}


