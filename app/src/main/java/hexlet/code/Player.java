package hexlet.code;

import java.util.Scanner;

public class Player {
    static Scanner scanner = new Scanner(System.in);
    private static String name;
    public static void askName() {
        System.out.print("May I have your name? ");
        name = scanner.next();
    }
    public static String getName() {
        return name;
    }
    public static void lossGame() {
        System.out.println("Let's try again, " + name + "!");
    }
    public static void winGame() {
        System.out.println("Congratulations, " + name + "!");
    }
}
