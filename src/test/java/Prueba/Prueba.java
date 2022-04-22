/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Conexion.Conexion;
import Controlador.Registr;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author johnn
 */
public class Prueba {
          
    public static void main(String[] args){
             Statement stmt;
     ResultSet rs;
           Connection con = Conexion.getConexion();
        try {
           rs=con.createStatement().executeQuery("SELECT * FROM registro");
           rs.next();
           do{
               System.out.println("....");
               Registr r= new Registr();
            if(rs.getString("usuario").equals(r.getUsuario())){
                if(rs.getString("contrase").equals("admin")){
                    System.out.println("registro");
                }
            }
           }while(rs.next());
        } catch (SQLException ex) {
            System.out.println("el problema esta en my sql");
        }
        System.out.println("login");
    }

}
