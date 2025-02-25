package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit");

        String gameNumber = scanner.next();
        System.out.println("Your choice: " + gameNumber);
        if (gameNumber.equals("0"))
            System.exit(0);


        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");

        switch (gameNumber) {
            case "1":
                System.exit(0);
            case "2":
                Even.main();
                }
        }
    public static void congratsWinner() {

        System.out.println("Congratulations, ");
    }

}


