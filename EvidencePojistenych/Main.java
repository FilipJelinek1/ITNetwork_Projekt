package EvidencePojistenych;

import java.util.Scanner;

/*
@Author Filip
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "utf-8");
        Evidence evidence = new Evidence();

        String volba = "";
        // hlavní menu
        while (!volba.equals("4")) {
            System.out.println("====================");
            System.out.println("Databáze pojištěných");
            System.out.println("====================");

            System.out.println("Seznam pojištěných");
            System.out.println("Vyberte akci");
            System.out.println("1. Přidat nového pojištěnce");
            System.out.println("2. Vyhledat pojištěnce");
            System.out.println("3. Výpis všch pojištěnců");
            System.out.println("4. Ukončit");

            System.out.println("Zadejte číslici: ");
            volba = sc.nextLine();
            System.out.println();

            // výběr dle volby uživatele
            switch (volba) {

                case "1":
                    // přidání nového pojištěnce
                    evidence.pridejPojisteneho();
                    break;
                case "2":
                    // vyhledání pojištěnce
                    evidence.vypisPojistence();
                    break;
                case "3":
                    // vypíše všechny pojištěnce
                    evidence.vypisVsechPojistencu();
                    break;
                case "4":
                    // ukončí program
                    System.out.println("Klávesou ukončíte program...");
                    break;
                default:
                    // v případě neplatné číslice / volby
                    System.out.println("Naplatná volba, stisknetě libovolnou číslici a opakujte volbu.");
                    break;
            }
        }
    }
    }



