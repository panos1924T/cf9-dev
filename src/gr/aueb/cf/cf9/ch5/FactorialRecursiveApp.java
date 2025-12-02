package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με αναδρομικό τρόπο.
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 0;
        int result = 0;

        System.out.println("Please enter a number: ");
        factorial = input.nextInt();

        result = facto(factorial);

        System.out.printf("The factorial of %d is: %d%n", factorial, result);
    }

    public static int facto(int factorial) {
            /*
            if (n == 1) {
                return 1;
             }
            return n * facto(factorial - 1);
             */
        return factorial <= 1 ? 1 : factorial * facto(factorial - 1);
    }
}