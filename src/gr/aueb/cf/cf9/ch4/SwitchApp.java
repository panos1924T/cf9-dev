package gr.aueb.cf.cf9.ch4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Εμφανίζουμε μενού στον χρήστη.
 * Ο χρήστης δίνει το choice.
 * Ανάλογα με το choice να δώσουμε feedback.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNum = 0;
        final int EXIT = 4;

        do {
            System.out.println("1. 1-player game");
            System.out.println("2. 2-player game");
            System.out.println("3. Start team game");
            System.out.println("4. Exit game");

            System.out.println("Please enter a valid number to use the menu: ");
            inputNum = input.nextInt();

            switch (inputNum) {
                case 1:
                    System.out.println("Starting 1-player game.");
                    break;
                case 2:
                    System.out.println("Starting 2-player game.");
                    break;
                case 3:
                    System.out.println("Starting team game.");
                    break;
                case 4:
                    System.out.println("Exiting the game.");
                    break;
                default:
                    System.out.println("Error in the input of the user.");
                    break;
            }
        } while (inputNum != EXIT);
    }
}
