package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MIN_FIRST_INT = 5;
    public static final int MAX_FIRST_INT_BOUND = 100;
    public static final int MIN_ADDITION_INT = 2;
    public static final int MAX_ADDITION_INT_BOUND = 50;
    public static final int MIN_HIDDEN_INDEX = 1;
    public static final int NUMBER_OF_ITEMS_IN_QUESTION = 10;
    public static final String RULES = "What number is missing in the progression?";

    public static void start() {
        Engine.beginGame(RULES, getQandA(Engine.ROUNDS));
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            int addition = Utils.randomIntGenerator(MIN_ADDITION_INT, MAX_ADDITION_INT_BOUND);
            int indexOfHiddenElement = Utils.randomIntGenerator(MIN_HIDDEN_INDEX, NUMBER_OF_ITEMS_IN_QUESTION - 1);
            int current = Utils.randomIntGenerator(MIN_FIRST_INT, MAX_FIRST_INT_BOUND);

            qAndA[i][0] = String.valueOf(current);
            for (int j = 1; j < NUMBER_OF_ITEMS_IN_QUESTION; j++) {
                current += addition;
                if (j == indexOfHiddenElement) {
                    qAndA[i][1] = String.valueOf(current);
                    qAndA[i][0] += (" ..");
                } else {
                    qAndA[i][0] += " " + current;
                }
            }
        }
        return qAndA;
    }
}
