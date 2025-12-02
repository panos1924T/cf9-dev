package gr.aueb.cf.cf9.ch8;

public class IndexOutOfBoundsExceptionApp {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 2};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
