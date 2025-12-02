package gr.aueb.cf.cf9.ch5;

/**
 * Demo του method overloading.
 * Όπου overload = ίδιο όνομα μεθόδου, διαφορετικές παράμετροι.
 * Method signature -> όνομα + παράμετροι
 */
public class MethodOverloading {

    public static void main(String[] args) {
        int sum1 = 0;
        long sum2 = 0L;
        int sum3 = 0;

        sum1 = add(10, 20);
        sum2 = add(10L, 20L);
        sum3 = add(10, 20, 30);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    //overloaded method
    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    //overloaded method
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
