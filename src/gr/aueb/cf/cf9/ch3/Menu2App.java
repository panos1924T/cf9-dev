package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * See MenuApp.java in ch3.
 */
public class Menu2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Please pick on of the above ");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice = in.nextInt();
            if (choice == 3) {
                break;
            }

            System.out.println("Thanks for using the program.");
        }
    }
}
