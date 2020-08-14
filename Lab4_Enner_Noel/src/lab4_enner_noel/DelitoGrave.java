package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class DelitoGrave {
   private String Descripcion;
   private String NombreVictima;
   private String Culpable;
   private String Sentencia;
   private String Fecha;
   private String Pais;
   private int NumDelito;

    public DelitoGrave() {
    }

    public DelitoGrave(String Descripcion, String NombreVictima, String Culpable, String Sentencia, String Fecha, String Pais, int NumDelito) {
        this.Descripcion = Descripcion;
        this.NombreVictima = NombreVictima;
        this.Culpable = Culpable;
        this.Sentencia = Sentencia;
        this.Fecha = Fecha;
        this.Pais = Pais;
        this.NumDelito = NumDelito;
    }

    public String getSentencia() {
        return Sentencia;
    }

    public void setSentencia(String Sentencia) {
        this.Sentencia = Sentencia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombreVictima() {
        return NombreVictima;
    }

    public void setNombreVictima(String NombreVictima) {
        this.NombreVictima = NombreVictima;
    }

    public String getCulpable() {
        return Culpable;
    }

    public void setCulpable(String Culpable) {
        this.Culpable = Culpable;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getNumDelito() {
        return NumDelito;
    }

    public void setNumDelito(int NumDelito) {
        this.NumDelito = NumDelito;
    }

    @Override
    public String toString() {
        return "DelitoGrave{" + "Descripcion=" + Descripcion + ", NombreVictima=" + NombreVictima + ", Culpable=" + Culpable + ", Fecha=" + Fecha + ", Pais=" + Pais + ", NumDelito=" + NumDelito + '}';
    }
   
}
