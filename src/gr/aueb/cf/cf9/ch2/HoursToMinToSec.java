package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Converts hours in minutes and then seconds from an input.
 */
public class HoursToMinToSec {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών:
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;
        final int HOURS_TO_MIN = 60;
        final int HOURS_TO_SEC = 360;

        //Εντολές:
        System.out.println("Παρακαλώ δώστε έναν αριθμό για τις ώρες: ");
        inputHours = scanner.nextInt();
        minutes = inputHours * HOURS_TO_MIN;
        seconds = inputHours * HOURS_TO_SEC;

        //Εκτέλεση:
        System.out.printf("Οι ώρες που επιλέξατε είναι: %,d λεπτά και %,d δευτερόλεπτα", minutes, seconds);

    }
}
