/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Terrorismo extends DelitoGrave {
    private String NomArtefacto;
    private int NumeroVictimas;

    public Terrorismo() {
    }
    
    public Terrorismo(String NomArtefacto, int NumeroVictimas, String Descripcion, String NombreVictima, String Culpable, String Sentencia, String Fecha, String Pais, int NumDelito) {
        super(Descripcion, NombreVictima, Culpable, Sentencia, Fecha, Pais, NumDelito);
        this.NomArtefacto = NomArtefacto;
        this.NumeroVictimas = NumeroVictimas;
    }

    
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
