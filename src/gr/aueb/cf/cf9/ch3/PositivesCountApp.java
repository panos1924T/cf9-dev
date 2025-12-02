package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positive numbers.
 * How many loops will be needed is a case
 * that happens @runtime.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int count = 0;

        System.out.println("Please enter a number: ");
        while (true) {
            inputNum = in.nextInt();
            if (inputNum > 0) {
                count ++;
            } else {
                break;
            }
        }

        System.out.printf("You entered %d positive numbers! %n", count);
    }
}
