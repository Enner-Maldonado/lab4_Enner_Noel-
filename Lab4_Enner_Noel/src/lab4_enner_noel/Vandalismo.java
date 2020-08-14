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
public class Vandalismo extends Delito_Menor{
    //Atributos
    private String edificacion;
    private String piso;
    private String nombre_dueño;

    //constructor
    public Vandalismo() {
        super();
    }

    public Vandalismo(String edificacion, String piso, String nombre_dueño, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos, String name_oficial, String ID, int num_celda) {
        super(descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos, name_oficial, ID, num_celda);
        this.edificacion = edificacion;
        this.piso = piso;
        this.nombre_dueño = nombre_dueño;
    }
    
    //Mutadores

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    @Override
    public String toString() {
        return "Vandalismo{" + "edificacion=" + edificacion + ", piso=" + piso + ", nombre_due\u00f1o=" + nombre_dueño + '}';
    }
    
    
    
}
