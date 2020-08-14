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
public class Asesinato extends DelitoGrave{
    //Atributos
    private String NomArma;
    private int NumCuerpos;
    
    //Contructores

    public Asesinato() {
        super();
    }

    public Asesinato(String NomArma, int NumCuerpos, int Grave, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(Grave, descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.NomArma = NomArma;
        this.NumCuerpos = NumCuerpos;
    }
    //Mutadores

    public String getNomArma() {
        return NomArma;
    }

    public void setNomArma(String NomArma) {
        this.NomArma = NomArma;
    }

    public int getNumCuerpos() {
        return NumCuerpos;
    }

    public void setNumCuerpos(int NumCuerpos) {
        this.NumCuerpos = NumCuerpos;
    }

    @Override
    public String toString() {
        return "Asesinato{" + "NomArma=" + NomArma + ", NumCuerpos=" + NumCuerpos + '}';
    }
    
    
}
