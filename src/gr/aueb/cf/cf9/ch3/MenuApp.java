package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα menu μέχρι ο χρήστης
 * να επιλέξει 'Exit'.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please pick on of the above ");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the program");
    }
}
