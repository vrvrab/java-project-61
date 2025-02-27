package hexlet.code;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit");
        System.out.print("Your choice: ");
        String menuChoice = scanner.next();

        switch (menuChoice) {
            case "0":
                System.exit(0);
            case "1":
                Cli.greet();
                break;
            case "2":
                App.greet();
                Even.begin();
                break;

        }
    }

    public static String name = "";
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
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + name + "!");
        System.exit(0);
    }
}


