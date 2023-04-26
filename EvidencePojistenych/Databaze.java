package EvidencePojistenych;

import java.util.Scanner;
import java.util.ArrayList;

/*
@Author Filip
 */
public class Databaze {


    public ArrayList<Pojistenci> databazePojistencu;
    public Scanner sc = new Scanner(System.in);
    public Pojistenci pojistenci;

    public Databaze() {
        databazePojistencu = new ArrayList<>();
    }

    // přidání nového pojištěnce
    public void pridejPojisteneho(String jmeno, String prijmeni, int vek, int telefon) {

        System.out.println("jméno: " + jmeno);
        System.out.println("příjmení: " + prijmeni);
        System.out.println("věk: " + vek);
        System.out.println("telefon: " + telefon);
        databazePojistencu.add(new Pojistenci(jmeno, prijmeni, vek, telefon));
    }

   // výpis pojištěného
    public ArrayList<Pojistenci> vypisPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenci> nalezene = new ArrayList<>();

        for (Pojistenci user : databazePojistencu) {
            {
                if (user.getJmeno().equalsIgnoreCase(jmeno) || user.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                    System.out.println("nalezen pojištěnec dle požadavků");
                    nalezene.add(user);
                }
            }
        }
        System.err.println("nenalezen žádný pojištěnec dle požadavků");
        return nalezene;
    }
    // výpis všech záznamů v databázi
    public ArrayList<Pojistenci> vypisVsechPojistencu() {
        return databazePojistencu;
    }

    }

