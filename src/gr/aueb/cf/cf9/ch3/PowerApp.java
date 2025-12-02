package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, a*n
 * (n times)
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int powerNum = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please give a number you want to calculate its power\n" +
                " and a number for the power:  ");
        inputNum = in.nextInt();
        powerNum = in.nextInt();

        while (i <= powerNum) {
            result *= inputNum;
            i++;
        }

        System.out.printf("The result of your inputs are: %d", result);
    }
}
