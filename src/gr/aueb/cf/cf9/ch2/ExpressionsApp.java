package gr.aueb.cf.cf9.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
            int num1 = 12;
            int num2 = 5;
            int sum;
            int sub;
            int mul;
            int div;
            int mod;
            int result1 = 0;
            int result2 = 0;
            int result3 = 0;
            int result4 = 0;
            int result5 = 0;
            int result6 = 0;

            sum = num1 + num2;
            sub = num1 - num2;
            mul = num1 * num2;
            div = num1 / num2;
            mod = num1 % num2;

            System.out.printf(" Sum: %d%n Sub: %02d%n Mul: %d%n Div: %02d%n Mod: %02d%n", sum, sub, mul, div, mod);

            result1 = result1 + 1;
            result2 += 1;
            result3++;
            result4 = num1++;
            result5 = ++num2;

            System.out.printf(" Result1: %d,%n Result2: %d,%n Result3: %d,%n", result1, result2, result3);
            System.out.printf(" Result4: %d,%n Result5: %d,%n", result4, result5);

            result6 = num1 + num2 * (result1 / result2) + (result3 % result4);
            System.out.printf(" Result6 is: %d%n", result6);
    }
}
