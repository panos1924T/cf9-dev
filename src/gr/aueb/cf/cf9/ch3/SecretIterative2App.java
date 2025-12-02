package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user enters inputs and tries to guess the secret number.
 */
public class SecretIterative2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_NUM = 23;
        int guessNum = 0;

        while (true) {
            System.out.println("Please guess the secret number");
            guessNum = in.nextInt();

            if (guessNum == SECRET_NUM) {
                System.out.println("You guessed it!");
                break;
            } else {
                System.out.println("Please try again!");
            }
        }
    }
}
