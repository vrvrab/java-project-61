package hexlet.code.games;

import java.util.Random;

public class Progression {
    public static final int MIN_FIRST_INT = 5;
    public static final int MAX_FIRST_INT_BOUND = 100;
    public static final int MIN_ADDITION_INT = 2;
    public static final int MAX_ADDITION_INT_BOUND = 50;
    public static final int MIN_HIDDEN_INDEX = 1;
    public static final int MAX_HIDDEN_INDEX_BOUND = 200;

    public static String getRules() {
        return "What number is missing in the progression?";
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            Random rand = new Random();
            int addition = rand.nextInt(MIN_ADDITION_INT, MAX_ADDITION_INT_BOUND);
            int indexOfHiddenElement = rand.nextInt(MIN_HIDDEN_INDEX, MAX_HIDDEN_INDEX_BOUND);
            int numberOfElementsInRow = 10;
            int current = rand.nextInt(MIN_FIRST_INT, MAX_FIRST_INT_BOUND);

            qAndA[i][0] = String.valueOf(current);
            for (int j = 1; j < numberOfElementsInRow; j++) {
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
