package gr.aueb.cf.cf9.ch6;

/**
 * Traverse an array. Διάσχιση, επίσκεψη και εκτύπωση.
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] grades = {10, 9, 8, 7, 6};
        int[] scores = new int[] {100, 90, 80, 70, 60};

        //Traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i <= grades.length - 1; i ++) {
            System.out.println(grades[i]);
        }

        for (int i = 0; i < scores.length; i++ ) {
            System.out.println(scores[i]);
        }

        //enhanced for
        for (int grade : grades) {
            System.out.println(grade);
        }

        for (int score : scores) {
            System.out.println(score + " ");
        }
    }
}
