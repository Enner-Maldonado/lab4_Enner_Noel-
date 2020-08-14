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
public class TraficoDeDrogas extends DelitoGrave{
    //Atributos
    private String NomDroga;
    private int CantDroga;
    
    //Constructores

    public TraficoDeDrogas() {
        super();
    }

    public TraficoDeDrogas(String NomDroga, int CantDroga, int Grave, String descripcion, String nombre, String culpable, String sentencia, String fecha, String pais, int num_delitos) {
        super(Grave, descripcion, nombre, culpable, sentencia, fecha, pais, num_delitos);
        this.NomDroga = NomDroga;
        this.CantDroga = CantDroga;
    }
    
    //Mutadores

    public String getNomDroga() {
        return NomDroga;
    }

    public void setNomDroga(String NomDroga) {
        this.NomDroga = NomDroga;
    }

    public int getCantDroga() {
        return CantDroga;
    }

    public void setCantDroga(int CantDroga) {
        this.CantDroga = CantDroga;
    }

    @Override
    public String toString() {
        return "TraficoDeDrogas{" + "NomDroga=" + NomDroga + ", CantDroga=" + CantDroga + '}';
    }
    
}
