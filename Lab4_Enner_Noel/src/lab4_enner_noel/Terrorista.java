package lab4_enner_noel;

/**
 *
 * @author noelg
 */
public class Terrorista extends Agentes {
    private String PaisAtacar;
    private String Ciudad;
    private String Metodo;

    public Terrorista() {
    }

    public Terrorista(String PaisAtacar, String Ciudad, String Metodo) {
        this.PaisAtacar = PaisAtacar;
        this.Ciudad = Ciudad;
        this.Metodo = Metodo;
    }

    public String getPaisAtacar() {
        return PaisAtacar;
    }

    public void setPaisAtacar(String PaisAtacar) {
        this.PaisAtacar = PaisAtacar;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    @Override
    public String toString() {
        return "Terrorista{" + "PaisAtacar=" + PaisAtacar + ", Ciudad=" + Ciudad + ", Metodo=" + Metodo + '}';
    }
    
    
}
