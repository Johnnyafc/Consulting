/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Usuario.Usuario;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author johnn
 */
@Named(value = "re")
@RequestScoped
public class Re {

    /**
     * Creates a new instance of Re
     */
           Statement stmt;
     ResultSet rs;
    private Usuario persona;
   private String usuario; 
    private String contrase;
    public Re() {
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
    public String validarDatos(){
         Connection con = Conexion.getConexion();
        try {
           rs=con.createStatement().executeQuery("SELECT * FROM registro");
           rs.next();
           do{
            if(rs.getString("usuario").equals(this.usuario)){
                if(rs.getString("contrase").equals(this.contrase)){
                   return "RegistroCompra"; 
                }
            }
           }while(rs.next());
        } catch (SQLException ex) {
            System.out.println("el problema esta en my sql");
        }
        return "Login";
    }
    
}
