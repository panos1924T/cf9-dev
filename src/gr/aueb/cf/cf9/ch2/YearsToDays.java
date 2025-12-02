package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες.
 * Θεωρούμε ότι 1 έτος = 365 μέρες.
 * Π.χ. ηλικία 20 ετών = 7.300 ημέρες.
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAge = 0;
        int ageInDays = 0;

        System.out.print("Παρακαλώ εισάγετε την ηλικία σας: ");
        inputAge = scanner.nextInt();
        ageInDays = inputAge * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d, ηλικία σε ημέρες: %,d\n", inputAge, ageInDays);
    }
}
