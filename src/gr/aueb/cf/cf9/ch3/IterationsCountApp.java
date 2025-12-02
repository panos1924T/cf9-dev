package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1,
 * the while-do loop will stop.
 */
public class IterationsCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int iterations = 0;

        System.out.println("Please give a number: ");
        inputNum = in.nextInt();

        while (inputNum != -1) {
            iterations ++;
            System.out.println("Please enter a number: ");
            inputNum = in.nextInt();
        }

        System.out.printf("The count of iterations is: %d", iterations);
    }
}
