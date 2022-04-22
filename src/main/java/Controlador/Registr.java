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
import javax.swing.JOptionPane;

/**
 *
 * @author johnn
 */
@Named(value = "registr")
@RequestScoped
public class Registr {

          Statement stmt;
     ResultSet rs;
    private Usuario persona;
   private String usuario; 
    private String contrase;
    public Registr() {
    }

    public Statement getStmt() {
        return stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public Usuario getPersona() {
        return persona;
    }

    public String getUsuario() {
        return usuario;
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
       
            if(rs.getString("usuario").equals("admin")){
                
                if(rs.getString("contrase").equals("admin")){
                   return "registro"; 
                }
            }
           }while(rs.next());
        } catch (SQLException ex) {
            System.out.println("el problema esta en my sql");
        }
        return "Login";
    }
    
}
