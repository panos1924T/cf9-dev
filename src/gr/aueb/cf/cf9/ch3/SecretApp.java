package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user tries to guess the secret number.
 */
public class SecretApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET_NUM = 23;
        int guessNum = 0;

        System.out.println("Please try to guess the secret number: ");
        guessNum = in.nextInt();

        if (guessNum == SECRET_NUM) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("Sorry.. Please restart and try again!");
        }
    }
}
