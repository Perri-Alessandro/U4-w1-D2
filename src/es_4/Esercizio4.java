package es_4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INSERISCI UN NUMERO INTERO");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("HAI INSERITO" + " " + numero);

        countdown(numero);

        scanner.close();
    }
    public static void countdown (int numero) {
        System.out.println("CONTO ALLA ROVESCIA:");
        for(int i = numero; i >= 0; i-- ) System.out.println(i);
    }
}
