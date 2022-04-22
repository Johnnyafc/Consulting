/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author johnn
 */
public class Conexion {
     public static final String URL = "jdbc:mysql://localhost:3306/hj consulting";
    public static final String USER = "root";
    public static final String CLAVE = "root";
    Statement stmt;
    ResultSet rs;
    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Existe un problema con la conexion");
        }
        return con;
    }
}
