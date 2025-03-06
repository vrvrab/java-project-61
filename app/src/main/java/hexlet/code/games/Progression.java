package hexlet.code.games;

import java.util.Random;

public class Progression {
    final private static String rules = "What number is missing in the progression?";
    public static String getRules () {
        return rules;
    }
    public static String[][] getQandA (int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            Random rand = new Random();
            int addition = rand.nextInt(2,50);
            int indexOfHiddenElement = rand.nextInt(0, 9);
            int numberOfElements = 10;
            int current = rand.nextInt(5, 100);

            qAndA[i][0] = String.valueOf(current);
            for (int j = 1; j < numberOfElements; j++) {
                current += addition;
                if (j == indexOfHiddenElement) {
                    qAndA[i][1] = String.valueOf(current);
                    qAndA[i][0] += (" ..");
                }
                else {
                    qAndA[i][0] += " " + current;
                }
            }
        }
        return qAndA;
    }
}
