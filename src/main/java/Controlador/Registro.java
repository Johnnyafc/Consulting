/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Usuario.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author johnn
 */
@Named(value = "registro")
@SessionScoped
public class Registro implements Serializable {
   private Usuario persona;
   private String usuario; 
    private String contrase;
    public Registro() {
    }
        public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    public String getContrase() {
        return contrase;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void validarDatos(){
        String usuario=this.usuario;
        String contra= this.contrase;
    }
}
