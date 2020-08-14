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
public class Terrorismo extends DelitoGrave{
    //Atributos
    private String NomArtefacto;
    private int NumeroVictimas;
    
    //Constructores

    public Terrorismo() {
        super();
    }

    public Terrorismo(String NomArtefacto, int NumeroVictimas, int Grave, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(Grave, descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.NomArtefacto = NomArtefacto;
        this.NumeroVictimas = NumeroVictimas;
    }
    
    //Mutadores

    public String getNomArtefacto() {
        return NomArtefacto;
    }

    public void setNomArtefacto(String NomArtefacto) {
        this.NomArtefacto = NomArtefacto;
    }

    public int getNumeroVictimas() {
        return NumeroVictimas;
    }

    public void setNumeroVictimas(int NumeroVictimas) {
        this.NumeroVictimas = NumeroVictimas;
    }
    
    @Override
    public String toString() {
        return "Terrorismo{" + "NomArtefacto=" + NomArtefacto + ", NumeroVictimas=" + NumeroVictimas + '}';
    }
    
}
