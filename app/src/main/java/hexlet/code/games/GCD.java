package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        int gcd = getGCD(b, a % b);
        return gcd;
    }

    private static String rules = "Find the greatest common divisor of given numbers.";
    public static String getRules() {
        return rules;
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            Random rand = new Random();
            int randomNumber1 = rand.nextInt(100);
            int randomNumber2 = rand.nextInt(100);
            qAndA[i][0] = String.valueOf(randomNumber1 + " " + randomNumber2);
            qAndA[i][1] = String.valueOf(getGCD(randomNumber1, randomNumber2));
        }
        return qAndA;
    }
}
