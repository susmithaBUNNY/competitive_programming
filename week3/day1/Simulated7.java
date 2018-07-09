import java.util.Random;

class Solution {

    private static final Random rnd = new Random();

    private static int rand5() {
        return rnd.nextInt(5) + 1;
    }

    public static int rand7() {
         while (true) {
        int roll1 = rand5();
        int roll2 = rand5();

        int outcomeNumber = (roll1-1) * 5 + (roll2-1) + 1;
        if (outcomeNumber > 21) continue;

        return outcomeNumber % 7 + 1;
    }

        // return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", rand7());
        }
        System.out.println();
    }
}
