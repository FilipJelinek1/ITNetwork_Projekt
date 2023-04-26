package EvidencePojistenych;

public class Pojistenci {


    public String jmeno;
    public String prijmeni;
    public int vek;
    public int telefon;


    public Pojistenci(String jmeno , String prijmeni, int vek, int telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni(){
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni){
        this.prijmeni = prijmeni;
    }


    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString(){
        return "jméno: " + jmeno + " " + "příjmení: " + prijmeni + " " + "věk: " + vek + " " + "telefon: " + telefon;
    }
}
