package es_2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI UN NUMERO INTERO");
        int intero = Integer.parseInt(scanner.nextLine());

        numero0o3(intero);

        scanner.close();

    }
    public static void numero0o3 (int intero) {
        String risultato;
        switch (intero) {
            case 0:
                risultato = "ZERO";
                break;
            case 1:
                risultato = "UNO";
                break;
            case 2:
                risultato = "DUE";
                break;
            case 3:
                risultato = "TRE";
                break;
            default:
                System.out.println("ERRORE, NUMERO NON PRESENTE TRA 0 E 3");
                return;
        }
        System.out.println("HAI INSERITO" + " " + risultato);
}
}