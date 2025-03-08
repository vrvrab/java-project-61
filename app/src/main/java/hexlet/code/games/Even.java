package hexlet.code.games;

import java.util.Random;

public class Even {
    public static final int MIN_RANDOM_INT = 1;
    public static final int MAX_RANDOM_INT = 200;

    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(MIN_RANDOM_INT, MAX_RANDOM_INT);
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
