package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "0 - Exit");

        String gameNumber = scanner.next();
        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case "0":
                break;
            case "1":
                Cli.greetings();


        }


    }
}
