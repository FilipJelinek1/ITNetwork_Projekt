package EvidencePojistenych;
/*
@Author Filip
 */

public class Pojistenci {

    public String jmeno; // křestní jméno pojištěnce
    public String prijmeni; // příjmení pojištěnce
    public int vek; // zadání věku pojištěnce
    public int telefon; // tel.číslo pojištěnce

    public Pojistenci(String jmeno , String prijmeni, int vek, int telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    // startregion gett a sett
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
    // endregion gett / sett

    @Override
    public String toString(){
        return "jméno: " + jmeno + " " + "příjmení: " + prijmeni + " " + "věk: " + vek + " " + "telefon: " + telefon;
    }
}
