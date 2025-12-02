package gr.aueb.cf.cf9.ch5;

/**
 * Ορίζει δύο μεθόδους, τις isEven και isOdd
 * για τον έλεγχο ενός ακεραίου
 * αν είναι άρτιος ή περιττός.
 */
public class EvenOddApp {

    public static void main(String[] args) {

    }

    public static boolean isEven(int num) {
        boolean result = false;

        if (num % 2 == 0) result = true;

        return result;

        //return num % 2 == 0;     Για πιο γρήγορα.
    }

    public static boolean isOdd(int num) {
        return !isEven(num);  // Άμα η isEven είναι false τότε επιστρέφει true και το ανάποδο.
    }
}
