package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου.
 * Για παράδειγμα, αν ο ακέραιος είναι το 178,
 * το πλήθος των ψηφίων είναι 3.
 */
public class DigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Please give a number: ");
        num = in.nextInt();

        inputNum = num; //Save for later use.
        while (num > 0) {
            num /= 10;
            digits += 1;
        }

        System.out.printf("Your number's digits are: %d", digits);
    }
}
