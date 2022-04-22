/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Cursos.Certificado;
import Usuario.Afiliado;
import Usuario.CompradorFinal;
import java.time.LocalDate;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author johnn
 */
@Named(value = "controlVenta")
@RequestScoped
public class ControlVenta {

     private String codigoVenta;
    private Afiliado vendedor;
    private Certificado certificado;
    private CompradorFinal comprador;
    private LocalDate fecha;

    public ControlVenta() {

    }



    public void setVendedor(Afiliado vendedor) {
        this.vendedor = vendedor;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public void setComprador(CompradorFinal comprador) {
        this.comprador = comprador;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public Afiliado getVendedor() {
        return vendedor;
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public CompradorFinal getComprador() {
        return comprador;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
}
