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
public class Violación extends DelitoGrave {
    //Atributos
    private int EdadVictima;
    
    //Constructores 

    public Violación() {
        super();
    }

    public Violación(int EdadVictima, int Grave, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(Grave, descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.EdadVictima = EdadVictima;
    }
    //Mutadores

    public int getEdadVictima() {
        return EdadVictima;
    }

    public void setEdadVictima(int EdadVictima) {
        this.EdadVictima = EdadVictima;
    }

    @Override
    public String toString() {
        return "Violaci\u00f3n{" + "EdadVictima=" + EdadVictima + '}';
    }
    
}
