package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //       int random = (int) (Math.random()*10);
        Random random = new Random();

        int[] arrayDiNumeri = new int[5];

        for (int i = 0; i < arrayDiNumeri.length; i++) {
            arrayDiNumeri[i] = random.nextInt(10) + 1; //+1 escludo lo 0 includo il 10

        }
        System.out.println(Arrays.toString(arrayDiNumeri));
        int numero = 1; //fuori dal do se no il while non riesce a leggerlo (consiglio di intelliJ) 1 così do un valore di default
        do {
            try {
                System.out.println("inserisci un numero da 1 a 10, 0 per terminare");
                numero = Integer.parseInt(sc.nextLine());
                if (numero != 0) {

                    System.out.println("scegli la posizione da 0 a 4");
                    int posizione = Integer.parseInt(sc.nextLine());
                    arrayDiNumeri[posizione] = numero;
                    System.out.println(Arrays.toString(arrayDiNumeri));
                }
            } catch (NumberFormatException ex) {
                System.out.println("inserisci un numero");

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("scegli una posizione valida, da 0 a 4");
            }


        } while (numero != 0);

    }
}
