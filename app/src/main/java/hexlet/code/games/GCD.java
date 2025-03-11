package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int MAX_RANDOM_INT = 100;
    public static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        Engine.beginGame(RULES, getQandA(Engine.ROUNDS));
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            int randomNumber1 = Utils.randomIntGenerator(MAX_RANDOM_INT);
            int randomNumber2 = Utils.randomIntGenerator(MAX_RANDOM_INT);
            qAndA[i][0] = randomNumber1 + " " + randomNumber2;
            qAndA[i][1] = String.valueOf(getGCD(randomNumber1, randomNumber2));
        }
        return qAndA;
    }
}
