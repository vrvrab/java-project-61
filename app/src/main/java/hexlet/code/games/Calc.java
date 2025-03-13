package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int MAX_RANDOM_INT = 100;
    public static final String RULES = "What is the result of the expression?";

    public static void start() {
        Engine.beginGame(RULES, getQandA(Engine.ROUNDS));
    }

    private static char getRandomOperator() {
        char[] operator = {'+', '-', '*'};
        int randIndex = Utils.randomIntGenerator(operator.length);
        return operator[randIndex];
    }

    public static String[][] getQandA(int rounds) {
        String[][] qAndA = new String[rounds][rounds];
        for (int i = 0; i < rounds; i++) {
            int randomNumber1 = Utils.randomIntGenerator(MAX_RANDOM_INT);
            int randomNumber2 = Utils.randomIntGenerator(MAX_RANDOM_INT);
            char randomOperator = getRandomOperator();
            qAndA[i][0] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            qAndA[i][1] = String.valueOf(getRightAnswer(randomNumber1, randomNumber2, randomOperator));
        }
        return qAndA;
    }

    private static int getRightAnswer(int n1, int n2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            default:
                break;
        }
        return result;
    }
}
