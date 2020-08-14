package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Secuestrador extends Agentes {
    private String NomVictima;
    private double CantRescate;

    public Secuestrador() {
    }

    public Secuestrador(String NomVictima, double CantRescate) {
        this.NomVictima = NomVictima;
        this.CantRescate = CantRescate;
    }

    public String getNomVictima() {
        return NomVictima;
    }

    public void setNomVictima(String NomVictima) {
        this.NomVictima = NomVictima;
    }

    public double getCantRescate() {
        return CantRescate;
    }

    public void setCantRescate(double CantRescate) {
        this.CantRescate = CantRescate;
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "NomVictima=" + NomVictima + ", CantRescate=" + CantRescate + '}';
    }
    
}
