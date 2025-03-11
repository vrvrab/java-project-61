package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int ROUNDS = 3;
    public static final int MIN_RANDOM_INT = 1;
    public static final int MAX_RANDOM_INT = 200;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        Engine.beginGame(RULES, ROUNDS, getQandA(ROUNDS));
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            int randomNumber = Utils.randomIntGenerator(MIN_RANDOM_INT, MAX_RANDOM_INT);
            qAndA[i][0] = String.valueOf(randomNumber);
            if (randomNumber % 2 == 0) {
                qAndA[i][1] = "yes";
            } else {
                qAndA[i][1] = "no";
            }
        }
        return qAndA;
    }
}
