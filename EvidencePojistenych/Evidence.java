package EvidencePojistenych;

import java.util.ArrayList;
import java.util.Scanner;

public class Evidence {

    public Databaze databaze;
    private final Scanner sc = new Scanner(System.in, "utf-8");
    public Evidence() {
        databaze = new Databaze();
    }

    public void pridejPojisteneho() {
        System.out.println("Přidejte pojištěnce");
        System.out.println("Zadejte jméno");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte telefonní číslo: ");
        int telefon = Integer.parseInt(sc.nextLine());

        databaze.pridejPojisteneho(jmeno, prijmeni, vek, telefon);

    }

    public void vypisPojistence() {
        System.out.println("Zadejte jméno hledaného pojištěnce: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení hledaného pojištěnce: ");
        String prijmeni = sc.nextLine();

        ArrayList<Pojistenci> databazePojistence = databaze.vypisPojistence(jmeno, prijmeni);
        System.out.println(databazePojistence.toString());
    }

    public void vypisVsechPojistencu() {
        ArrayList<Pojistenci> databazePojistencu = databaze.vypisVsechPojistencu();

        System.out.println("vypisVsechnyzaznamy hledaných pojištěnců" + databazePojistencu.toString());
    }
}
