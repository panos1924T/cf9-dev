package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature and the status
 * of usRaining variable and calculates if it is snowing or not.
 * If it is raining and the temperature is < 0, it is snowing.
 */
public class SnowingApp {

    public static void main(String[] args) {

        //
        Scanner in = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        //
        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false): ");
        isRaining = in.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία: ");
        temperature = in.nextInt();

        //
        isSnowing = isRaining && (temperature < 0);

        //
        System.out.printf("Is snowing: %b%n", isSnowing);
    }
}
