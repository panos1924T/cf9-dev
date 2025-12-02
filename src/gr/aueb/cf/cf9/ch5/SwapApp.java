package gr.aueb.cf.cf9.ch5;

/**
 * Ορίζουμε μια μέθοδο swap (int a, int b)
 * η οποία θα ανταλλάσει αμοιβαία τις τιμές a, b.
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.printf("a = %d , b = %d%n", a, b);

        swap(a, b);

        System.out.printf("a = %d , b = %d%n", a, b);
    }

    /**
     * Swap two numbers
     * @param a  the first number
     * @param b  the second number
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
