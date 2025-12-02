package gr.aueb.cf.cf9.ch4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο ως base
 * και έναν ως power και το πρόγραμμα
 * υπολογίζει base^power.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please enter a number for the base: ");
        base = input.nextInt();
        System.out.println("Please now enter a number for the power :");
        power = input.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("%d ^ %d = %d%n", base, power, result);
    }
}
