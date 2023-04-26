package EvidencePojistenych;

import java.util.Scanner;
import java.util.ArrayList;

public class Databaze {


    public ArrayList<Pojistenci> databazePojistencu;
    public Scanner sc = new Scanner(System.in);
    public Pojistenci pojistenci;

    public Databaze() {
        databazePojistencu = new ArrayList<>();
    }

    public void pridejPojisteneho(String jmeno, String prijmeni, int vek, int telefon) {

        System.out.println("jméno: " + jmeno);
        System.out.println("příjmení: " + prijmeni);
        System.out.println("věk: " + vek);
        System.out.println("telefon: " + telefon);
        databazePojistencu.add(new Pojistenci(jmeno, prijmeni, vek, telefon));

    }

    public ArrayList<Pojistenci> vypisPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenci> nalezene = new ArrayList<>();

        for (Pojistenci user : databazePojistencu) {
            {
                if(pojistenci.getJmeno().equals(jmeno)
                        && pojistenci.getPrijmeni().equals(prijmeni)) {
                    System.out.println("nalezen pojištěnec dle požadavků");
                    nalezene.add(user);
                }

            }
        }
        System.err.println("nenalezen žádný pojištěnec dle požadavků");
        return nalezene;
    }

    public ArrayList<Pojistenci> vypisVsechPojistencu() {
        return databazePojistencu;
    }

    }

