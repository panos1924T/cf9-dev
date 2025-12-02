package gr.aueb.cf.cf9.ch5;

/**
 * Demo of Addition method.
 */
public class AddApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = add(num1, num2); /* Αν την καλούσαμε από άλλη κλάση θα βάζαμε
                                  ολόκληρο το όνομα. Π.χ. AddApp.add() */

        System.out.printf("THe sum equals to %,d%n", sum);
    }

    public static int add(int a, int b) {

        /* //Δήλωση και αρχικοποίηση.
        int sum = 0;

        //Επεξεργασία των δεδομένων εισόδου.
        sum = a + b;

        //Επιστροφή αποτελέσματος.
        return sum;*/

        return a + b;
    }
}
