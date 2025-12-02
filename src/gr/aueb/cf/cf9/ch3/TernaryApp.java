package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής demo. Υπολογίζει
 * τον μικρότερο μεταξύ δύο ακεραίων.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

//        if (num1 < num2) {
//            min = num1;
//        } else {
//            min = num2;
//        }
        min = num1 < num2 ? num1 : num2;  //syntactic sugar.
        // μεταφράζεται ως: if num1<min2 then num1 else num2

        System.out.printf("The smallest number is: %d", min);

    }
}
