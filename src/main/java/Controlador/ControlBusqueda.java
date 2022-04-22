/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Cursos.Certificado;
import Usuario.Afiliado;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author johnn
 */
@Named(value = "controlBusqueda")
@RequestScoped
public class ControlBusqueda {
    
    public ControlBusqueda() {
    }
public static List<Certificado> buscarCertificadoPorCodigo(Afiliado vendedor, String codigo){
// lISTA DE VENTAS 
//RETORNAR CERTIFICADOS VENDIDOS LISTA
return null; 
}
public static List<Certificado> buscarCertificadoPorNombre(String nombre){
    return null;
}
public static List<Certificado> buscarCertificadoPorNombre(Afiliado vendedor,String nombre){
    return null;
}
public static List<Certificado> buscarCertificadoPorPrecio(double precio){
    return null;
    
}
}
