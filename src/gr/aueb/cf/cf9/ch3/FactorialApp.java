package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate factorial of a number.
 * n! = 1 * 2 * 3 * 4 *...* n
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorialNum = 0;
        int i = 1;
        int factorial = 1;

        System.out.println("Παρακαλώ δώσε τον αριθμό που θέλεις να υπολογιστεί ο factorial: ");
        factorialNum = in.nextInt();
        while (i <= factorialNum) {
            factorial *= i;
            i ++;
        }

        System.out.printf("Το αποτέλεσμα είναι: %,d", factorial);
    }
}
