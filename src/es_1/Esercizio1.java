package es_1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI UNA STRINGA");
        String inseriscila = scanner.nextLine();
        System.out.println("HAI INSERITO" + " " + inseriscila);

        pariOdispari(inseriscila);

        System.out.println("INSERISCI UN ANNO");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println("HAI INSERITO" + " " + anno);

annoBisestile(anno);

        scanner.close();

    }
    public static boolean pariOdispari (String inseriscila) {
        if (inseriscila.length() % 2 == 0) {
            System.out.println("LA STRINGA INSERITA CONTIENE UN NUMERO PARI DI CARATTERI");
            return true;
        }
        else {
            System.out.println("LA STRINGA INSERITA CONTIENE UN NUMERO DISPARI DI CARATTERI");
            return false;
        }
    }
    public static boolean annoBisestile (int anno) {
        if  ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            System.out.println("L'ANNO INSERITO è BISESTILE");
            return true;
        }
        else {
            System.out.println("L'ANNO INSERITO NON è BISESTILE");
            return false;
        }
    }
}
