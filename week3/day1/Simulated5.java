import java.util.Random;

class Solution {

    private static final Random rnd = new Random();

    private static int rand7() {
        return rnd.nextInt(7) + 1;
    }

    public static int rand5() {
    int res = 7;  
    while (res > 5) {
        res = rand7();
    }
    return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", rand5());
        }
        System.out.println();
    }
}
