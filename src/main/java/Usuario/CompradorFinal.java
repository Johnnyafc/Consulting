
package Usuario;

/**
 *
 * @author johnn
 */
public class CompradorFinal {
    private String nombre;
private String cedula; 
private String correo;
private Afiliado vendedor;
    public CompradorFinal(String nombre, String cedula, String correo, Afiliado vendedor) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.vendedor = vendedor;
    }

    public void setVendedor(Afiliado vendedor) {
        this.vendedor = vendedor;
    }

    public Afiliado getVendedor() {
        return vendedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }
}
