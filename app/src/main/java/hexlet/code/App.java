package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    private static final int ROUNDS = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();

        switch (gameNumber) {
            case "0":
                System.exit(0);
            case "1":
                Engine.greet();
                break;
            case "2":
                Engine.beginGame(Even.getRules(), Even.getQandA(ROUNDS), ROUNDS);
                break;
            case "3":
                Engine.beginGame(Calc.getRules(), Calc.getQandA(ROUNDS), ROUNDS);
            case "4":
                Engine.beginGame(GCD.getRules(), GCD.getQandA(ROUNDS), ROUNDS);
            case "5":
                Engine.beginGame(Progression.getRules(), Progression.getQandA(ROUNDS), ROUNDS);
            case "6":
                Engine.beginGame(Prime.getRules(), Prime.getQandA(ROUNDS), ROUNDS);
            default:
                System.out.println("'" + gameNumber + "' is not a game number. Bye!");
                break;

        }
    }
}
