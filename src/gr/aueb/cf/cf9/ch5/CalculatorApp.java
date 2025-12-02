package gr.aueb.cf.cf9.ch5;

import gr.aueb.cf.cf9.ch4.SwitchApp;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης.
 * Επιλέγει από ένα μενού μία πράξη, του ζητάει το πρόγραμμα δύο αριθμούς.
 * Yπολογίζει την πράξη και επιστρέφει.
 * Ξαναεμφανίζει το μενού.
 * Βάζω το switch μέσα στο method.
 * Φτιάχνω όλα τα methods των πράξεων.
 * Μπορώ επίσης να το κάνω με method για το menu.
 * Δημιουργώ μια method που θα ελέγχει αν το choice είναι valid (isValid).
 */
public class CalculatorApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 6;
        int result = 0;

        do {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Η επιλογή πρέπει να είναι μεταξύ 1-6. ");
                continue;
            }
            if (choice == EXIT) {
                System.out.println("Τέλος προγράμματος. ");
                break;
            }

            result = getResultOnChoice(choice);

            System.out.println("Result = " + result);
        } while (choice != EXIT);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt() {
        return input.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <=6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please give 2 numbers: ");
        num1 = getOneInt();
        num2 = getOneInt();

        //        switch (choice) {
//            case 1:
//                result = add(num1, num2);
//                break;
//            case 2:
//                result = sub(num1, num2);
//                break;
//            case 3:
//                result = mul(num1, num2);
//                break;
//            case 4:
//                result = div(num1, num2);
//                break;
//            case 5:
//                result = mod(num1, num2);
//                break;
//            default:
//                System.out.println("Λάθος επιλογή");
//                break;
//        }
//        return result;

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 % num2;
    }
}
