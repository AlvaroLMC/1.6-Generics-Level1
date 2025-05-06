package Exercise1;

public class NoGenericMethods {
    String uno;
    String dos;
    String tres;

    public NoGenericMethods(String uno, String dos, String tres) {
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
    }

    public String getUno() {
        return uno;
    }

    public String getDos() {
        return dos;
    }

    public String getTres() {
        return tres;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }
}