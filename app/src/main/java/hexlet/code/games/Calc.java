package hexlet.code.games;

import java.util.Random;

public class Calc {
    static final int MAX_RANDOM_INT = 100;

    public static String getRules() {
        return "What is the result of the expression?";
    }

    private static char getRandomOperator() {
        char[] operator = {'+', '-', '*'};
        Random rand = new Random();
        int randIndex = rand.nextInt(operator.length);
        return operator[randIndex];
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];

        for (int i = 0; i < rounds; i++) {

            Random rand = new Random();
            int randomNumber1 = rand.nextInt(MAX_RANDOM_INT);
            int randomNumber2 = rand.nextInt(MAX_RANDOM_INT);
            char randomOperator = getRandomOperator();
            qAndA[i][0] = randomNumber1 + " " + randomOperator + " " + randomNumber2;

            switch (randomOperator) {
                case '+':
                    qAndA[i][1] = String.valueOf(randomNumber1 + randomNumber2);
                    break;
                case '-':
                    qAndA[i][1] = String.valueOf(randomNumber1 - randomNumber2);
                    break;
                case '*':
                    qAndA[i][1] = String.valueOf(randomNumber1 * randomNumber2);
                    break;
                default:
                    break;

            }
        }
        return qAndA;
    }
}
