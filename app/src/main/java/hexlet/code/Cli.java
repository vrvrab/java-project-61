package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greet() {

        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = scanner.next();
        System.out.println("Hello, " + username + "!");
        scanner.close();
        return username;
    }
}
