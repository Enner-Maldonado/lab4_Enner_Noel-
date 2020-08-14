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
public class DelitoGrave extends Delitos{
    //Atributos
    private int Grave;
    
    //COnstructor

    public DelitoGrave() {
        super();
    }

    public DelitoGrave(int Grave, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.Grave = Grave;
    }
    //Mutadores

    public int getGrave() {
        return Grave;
    }

    public void setGrave(int Grave) {
        this.Grave = Grave;
    }

    @Override
    public String toString() {
        return "DelitoGrave{" + "Grave=" + Grave + '}';
    }
    
}
