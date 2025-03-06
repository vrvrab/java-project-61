package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    private static final int rounds = 3;
    public static void main(String[] args) {

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
                Engine.beginGame(Even.getRules(), Even.getQandA(rounds), rounds);
                break;
            case "3":
                Engine.beginGame(Calc.getRules(), Calc.getQandA(rounds), rounds);
            case "4":
                Engine.beginGame(GCD.getRules(), GCD.getQandA(rounds), rounds);
            case "5":
                Engine.beginGame(Progression.getRules(), Progression.getQandA(rounds), rounds);
            case "6":
                Engine.beginGame(Prime.getRules(), Prime.getQandA(rounds), rounds);
            default:
                System.out.println("'" + gameNumber + "' is not a game number. Bye!");
                break;

        }
    }
}
