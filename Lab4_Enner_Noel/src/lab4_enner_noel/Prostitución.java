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
public class Prostitución extends Delito_Menor{
    //Atributos
    private String nombre_Solicitante;
    
    //Constructores
    public Prostitución() {
        super();
    }

    public Prostitución(String nombre_Solicitante, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos, String name_oficial, String ID, int num_celda) {
        super(descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos, name_oficial, ID, num_celda);
        this.nombre_Solicitante = nombre_Solicitante;
    }
    
    //Mutadores

    public String getNombre_Solicitante() {
        return nombre_Solicitante;
    }

    public void setNombre_Solicitante(String nombre_Solicitante) {
        this.nombre_Solicitante = nombre_Solicitante;
    }

    @Override
    public String toString() {
        return "Prostituci\u00f3n{" + "nombre_Solicitante=" + nombre_Solicitante + '}';
    }
    
}
