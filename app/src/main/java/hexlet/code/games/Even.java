package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String getRules() {
        return rules;
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[3][3];
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            Random rand = new Random();
            int randomNumber = rand.nextInt(1, 200);
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
