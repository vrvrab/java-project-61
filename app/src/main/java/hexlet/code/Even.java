package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void begin() {
        int counterRightAnswers = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (counterRightAnswers <3){
            Scanner scanner = new Scanner(System.in);
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            System.out.print("Question: " + randomNumber + "\n");
            String rightAnswer = "";
            if (randomNumber % 2 == 0) {
                rightAnswer = "yes";
            }
            else rightAnswer = "no";


            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (randomNumber % 2 == 0 && answer.equalsIgnoreCase("yes")
                    || randomNumber % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                counterRightAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is a wrong answer ;(. Correct answer was "
                        + "'" + rightAnswer + "'.");
                App.tryAgain();
            }
        }
        if (counterRightAnswers == 3) {
            App.congratulate();
        }

    }

}
