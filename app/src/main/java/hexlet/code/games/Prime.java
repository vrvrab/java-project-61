package hexlet.code.games;

import java.util.Random;

public class Prime {
    private static String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

    public static String getRules() {
        return rules;
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[3][3];
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(1, 200);
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
