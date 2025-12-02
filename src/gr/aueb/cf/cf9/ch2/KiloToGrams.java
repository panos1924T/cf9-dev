package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Converts kilos to kilograms
 */
public class KiloToGrams {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών:
        Scanner scanner = new Scanner(System.in);
        int kilos = 0;
        int grams = 0;
        final int KILOS_TO_GRAMS = 1000;

        // Εντολές:
        System.out.print("Παρακαλώ εισάγετε τα κιλά που θέλετε να μετατρέψετε: ");
        kilos = scanner.nextInt();
        grams = kilos * KILOS_TO_GRAMS;

        //Εκτέλεση:
        System.out.printf("Το βάρος %d που δώσατε είναι: %,d γραμμάρια.", kilos, grams);
    }
}
