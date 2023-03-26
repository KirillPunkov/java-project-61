package hexlet.code;

import java.util.Scanner;

public class Greet {
    static Scanner scanner = new Scanner(System.in);

    private static String playerName;
    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
    }
    public static String getPlayerName() {
        return playerName;
    }
}
