package gr.aueb.cf.cf9.ch4;

/**
 * Υπολογίζει και εκτυπώνει το άθροισμα
 * και το γινόμενο των 10 πρώτων ακεραίων.
 * Με if και δήλωση i μέσα στην if.
 */
public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.printf("Το άθροισμα των 10 πρώτων ακεραίων είναι: %d%n " +
                "και το γινόμενό τους: %d", sum, mul);
    }
}
