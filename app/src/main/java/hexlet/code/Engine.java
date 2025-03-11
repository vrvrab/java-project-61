package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name = "";

    public static void beginGame(String rules, int rounds, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        int counterRightAnswers = 0;

        for (int i = 0; counterRightAnswers < rounds; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                counterRightAnswers++;

            } else {
                System.out.println("'" + userAnswer + "'" + " is a wrong answer ;(. "
                        + "Correct answer was '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        if (counterRightAnswers == rounds) {
            System.out.println("Congratulations, " + name + "!");
            System.exit(0);
        }
    }

}
