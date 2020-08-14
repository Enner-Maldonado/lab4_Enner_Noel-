/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_enner_noel;

/**
 *
 * @author ENNER
 */
public class Secuestro extends DelitoGrave{
    //atributos
    private String TiempoRetenido;
    private String EstadoPersona;
    
    //Construtores

    public Secuestro() {
        super();
    }

    public Secuestro(String TiempoRetenido, String EstadoPersona, int Grave, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(Grave, descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.TiempoRetenido = TiempoRetenido;
        this.EstadoPersona = EstadoPersona;
    }
    
    //Mutadores

    public String getTiempoRetenido() {
        return TiempoRetenido;
    }

    public void setTiempoRetenido(String TiempoRetenido) {
        this.TiempoRetenido = TiempoRetenido;
    }

    public String getEstadoPersona() {
        return EstadoPersona;
    }

    public void setEstadoPersona(String EstadoPersona) {
        this.EstadoPersona = EstadoPersona;
    }

    @Override
    public String toString() {
        return "Secuestro{" + "TiempoRetenido=" + TiempoRetenido + ", EstadoPersona=" + EstadoPersona + '}';
    }
}
