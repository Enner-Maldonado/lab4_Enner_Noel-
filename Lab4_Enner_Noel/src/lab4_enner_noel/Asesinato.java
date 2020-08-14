package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Asesinato extends DelitoGrave {
    private String NomArma;
    private int NumCuerpos;

    public Asesinato(String NomArma, int NumCuerpos) {
        this.NomArma = NomArma;
        this.NumCuerpos = NumCuerpos;
    }

    public Asesinato(String NomArma, int NumCuerpos, String Descripcion, String NombreVictima, String Culpable, String Sentencia, String Fecha, String Pais, int NumDelito) {
        super(Descripcion, NombreVictima, Culpable, Sentencia, Fecha, Pais, NumDelito);
        this.NomArma = NomArma;
        this.NumCuerpos = NumCuerpos;
    }

    

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
