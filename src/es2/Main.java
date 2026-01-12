package es2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("inserisci i km percorsi");
            int km = Integer.parseInt(sc.nextLine());

            System.out.println("inserisci i litri consumati");
            int l = Integer.parseInt(sc.nextLine());

            int kmL = km / l;
            System.out.println("la tua macchina fa " + kmL + " km/L");
        } catch (ArithmeticException ex) {

            System.out.println("errore hai diviso per 0");
        } catch (NumberFormatException ex) {
            System.out.println("digita un numero");
        }
    }


}
