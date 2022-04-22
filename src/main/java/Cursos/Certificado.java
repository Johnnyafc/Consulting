/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cursos;

/**
 *
 * @author johnn
 */
public class Certificado {
    private String nombre; 
    private String tipo; 
    private String codigo; 
    private String descripcion;
    
    public Certificado(String nombre, String tipo, String codigo, String descripcion){
        this.nombre = nombre; 
        this.tipo = tipo; 
        this.codigo = codigo; 
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
