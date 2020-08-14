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
public class Asesino extends Agentes {
    private String NomVictima;
    private String Arma;

    public Asesino() {
    }

    public Asesino(String NomVictima, String Arma) {
        this.NomVictima = NomVictima;
        this.Arma = Arma;
    }

    public String getNomVictima() {
        return NomVictima;
    }

    public void setNomVictima(String NomVictima) {
        this.NomVictima = NomVictima;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    @Override
    public String toString() {
        return "Asesino{" + "NomVictima=" + NomVictima + ", Arma=" + Arma + '}';
    }
    
}
