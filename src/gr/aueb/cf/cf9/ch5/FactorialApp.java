package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωγικό του n με μέθοδο.
 * Το n! = 1 * 2 * 3 * 4 * ... * n
 * και 0! = 1.
 */
public class FactorialApp {

    public static void main(String[] args) {

        //Declaration of variables.
        Scanner input = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        //Input data from the user and data binding.
        System.out.println("Please enter a number: ");
        num = input.nextInt();

        //Call the service method - delegation.
        factorial = fact(num);  //Inject the num real parameter.

        //Printing the output to the monitor
        System.out.printf("The factorial of %d is: %d", num, factorial);
    }

    /**
     * Calculates the factorial of n.
     *
     * @param n  the number to calculate factorial of.
     * @return   the factorial of n.
     */
    public static int fact(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return  factorial;
    }
}
