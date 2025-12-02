package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει μία
 * θερμοκρασία. Το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία < 0, τότε μια μεταβλητή γίνεται true,
 * αλλιώς false.
 */

public class TemperatureApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση δεδομένων.
        Scanner in = new Scanner(System.in);
        int temperature = 0;
        boolean isTemperatureZero = false;

        //Εισαγωγή δεδομένων.
        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία: ");
        temperature = in.nextInt();

        //Επεξεργασία των δεδομένων.
        isTemperatureZero = temperature < 0;

        //Εκτυπώνοντας το αποτέλεσμα.
        System.out.printf("Η θερμοκρασία είναι μικρότερη απο 0: %b%n", isTemperatureZero);
    }
}
