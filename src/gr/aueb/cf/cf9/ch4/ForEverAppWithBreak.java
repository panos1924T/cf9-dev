package gr.aueb.cf.cf9.ch4;

public class ForEverAppWithBreak {

    public static void main(String[] args) {
        int count = 0;

        for (;;) {
            System.out.println("Forever");
            count++;

            //Άμα θέλω να εκτυπώνει ανα 20.
            //Άμα έχει μία εντολή η if μπορώ να την γράφω δίπλα.
            if (count % 20 == 0) System.out.println();
            if (count == 100) break;
        }
    }
}
