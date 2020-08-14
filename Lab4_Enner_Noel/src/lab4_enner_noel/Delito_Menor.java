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
public class Delito_Menor extends Delitos{
    //Atributos
    private String name_oficial;
    private String ID;
    private int num_celda;
    
    //COnstructores

    public Delito_Menor() {
        super();
    }

    public Delito_Menor(String name_oficial, String ID, int num_celda, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.name_oficial = name_oficial;
        this.ID = ID;
        this.num_celda = num_celda;
    }
    
    //Mutadores

    public String getName_oficial() {
        return name_oficial;
    }

    public void setName_oficial(String name_oficial) {
        this.name_oficial = name_oficial;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNum_celda() {
        return num_celda;
    }

    public void setNum_celda(int num_celda) {
        this.num_celda = num_celda;
    }

    @Override
    public String toString() {
        return "Delito_Menor{" + "name_oficial=" + name_oficial + ", ID=" + ID + ", num_celda=" + num_celda + '}';
    }
    
    
}
