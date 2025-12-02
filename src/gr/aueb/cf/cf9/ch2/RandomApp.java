package gr.aueb.cf.cf9.ch2;

/**
 * Παράγει ένα τυχαίο ακέραιο μεταξύ 1 και 6 (ζάρι).
 */
public class RandomApp {

    public static void main(String[] args) {
        int dice = 0;

        dice = (int) (Math.random() * 6) + 1;

        System.out.println((dice));
    }
}
