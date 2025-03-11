package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MIN_RANDOM_INT = 1;
    public static final int MAX_RANDOM_INT = 200;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        Engine.beginGame(RULES, getQandA(Engine.ROUNDS));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            int randomNumber = Utils.randomIntGenerator(MIN_RANDOM_INT, MAX_RANDOM_INT);
            qAndA[i][0] = String.valueOf(randomNumber);
            if (isPrime(randomNumber)) {
                qAndA[i][1] = "yes";
            } else {
                qAndA[i][1] = "no";
            }
        }
        return qAndA;
    }
}
