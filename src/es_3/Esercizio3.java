package es_3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI UNA STRINGA");
        String stringa = scanner.nextLine();
        System.out.println("HAI INSERITO" + " " + stringa);

        dividiInCar(stringa);

        scanner.close();

    }
    public static void dividiInCar (String stringa) {
        int i = 0;
        while (i <= stringa.length() -1) {
            if (stringa.contains(":q")) {
                System.out.println("HAI INSERITO :Q , TERMINO IL PROGRAMMA");
                break;
            }
            System.out.print(stringa.charAt(i));
            if (i != stringa.length() - 1) {
                System.out.print(", ");
            }
            i++;
        }
    }
}
