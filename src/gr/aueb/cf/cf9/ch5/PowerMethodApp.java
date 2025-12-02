package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο.
 */
public class PowerMethodApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please give a number for the base: ");
        base = input.nextInt();
        System.out.println("Now give a number for the power: ");
        power = input.nextInt();

        result = powerExe(base, power);

        System.out.printf("The %d power of %d is: %d", power, base, result);

    }

    public static int powerExe(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }
}
