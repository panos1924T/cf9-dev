package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * This programs reads an amount of euro and converts it to usd and prints it
 * together with the remaining cents.
 * For every 1 euro = 99 usa cents.
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {

        //Declaration of variables.
        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        final int USD_CONV = 99;
        int usd = 0;
        int usdCents = 0;
        int remainingCents = 0;

        //These are the commands lines.
        System.out.println("Παρακαλώ δώστε έναν ποσό σε ευρώ: ");
        inputEuros = in.nextInt();
        usdCents = inputEuros * USD_CONV;
        usd = usdCents / 100;
        remainingCents = usdCents % 100;

        //Printing the output.
        System.out.printf("Euros: %,d = %,d usd and %,d cents.%n", inputEuros, usd, remainingCents);
    }
}
