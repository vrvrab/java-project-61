package hexlet.code;

import java.util.Random;

public class Utils {
    public static int randomIntGenerator(int min, int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(min, max);
        return randomNumber;
    }

    public static int randomIntGenerator(int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(0, max);
        return randomNumber;
    }
}
