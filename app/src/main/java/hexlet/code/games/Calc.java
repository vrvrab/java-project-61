package hexlet.code.games;

import java.util.Random;

public class Calc {

    private static String rules = "What is the result of the expression?";
    public static String getRules () {
        return rules;
    }

    private static char getRandomOperator() {
        char[] operator = {'+', '-', '*'};
        Random rand = new Random();
        int randIndex = rand.nextInt(operator.length);
        return operator[randIndex];
    }

    public static String[][] getQandA (int rounds) {
        String[][] qAndA = new String[rounds][rounds];

        for (int i = 0; i < rounds; i++) {

            Random rand = new Random();
            int randomNumber1 = rand.nextInt(100);
            int randomNumber2 = rand.nextInt(100);
            char randomOperator = getRandomOperator();
            qAndA[i][0] = String.valueOf(randomNumber1 + " " + randomOperator + " " + randomNumber2);

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
            }
        }
        return qAndA;
    }
}
