package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name = "";

    public static String greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void congratulate() {
        System.out.println("Congratulations, " + name + "!");
        System.exit(0);
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + name + "!");
        System.exit(0);
    }

    public static boolean checkAnswer(String userAnswer, String rightAnswer) {
        if (userAnswer.equalsIgnoreCase(rightAnswer)) {
            return true;
        }
        return false;
    }

    public static void beginGame(String rules, String[][] questionsAndAnswers, int rounds) {
        Scanner scanner = new Scanner(System.in);
        greet();
        System.out.println(rules);
        String[][] qAndA = questionsAndAnswers;
        int counterRightAnswers = 0;

        for (int i = 0; counterRightAnswers < rounds; i++) {
            System.out.println("Question: " + qAndA[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (checkAnswer(userAnswer, qAndA[i][1])) {
                System.out.println("Correct!");
                counterRightAnswers++;

            } else {
                System.out.println("'" + userAnswer + "'" + " is a wrong answer ;(. "
                        + "Correct answer was '" + qAndA[i][1] + "'.");
                Engine.tryAgain();
            }
        }
        if (counterRightAnswers == rounds) {
            congratulate();
        }
    }
}
