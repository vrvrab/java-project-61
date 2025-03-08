package hexlet.code.games;

import java.util.Random;

public class GCD {
    static final int MAX_RANDOM_INT = 100;
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            Random rand = new Random();
            int randomNumber1 = rand.nextInt(MAX_RANDOM_INT);
            int randomNumber2 = rand.nextInt(MAX_RANDOM_INT);
            qAndA[i][0] = randomNumber1 + " " + randomNumber2;
            qAndA[i][1] = String.valueOf(getGCD(randomNumber1, randomNumber2));
        }
        return qAndA;
    }
}
