package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class TraficoDeDrogas extends DelitoGrave {
    private String NomDroga;
    private int CantDroga;

    public TraficoDeDrogas() {
    }

    public TraficoDeDrogas(String NomDroga, int CantDroga) {
        this.NomDroga = NomDroga;
        this.CantDroga = CantDroga;
    }

    public TraficoDeDrogas(String NomDroga, int CantDroga, String Descripcion, String NombreVictima, String Culpable, String Sentencia, String Fecha, String Pais, int NumDelito) {
        super(Descripcion, NombreVictima, Culpable, Sentencia, Fecha, Pais, NumDelito);
        this.NomDroga = NomDroga;
        this.CantDroga = CantDroga;
    }

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
