package hexlet.code;

import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    private static String correctAnswer;

    public static void askPlayerName() {
        System.out.print("May I have your name? ");
        playerName = scanner.next();
    }
    public static String getPlayerName() {
        return playerName;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
    public static void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public static void lossGame(String playerAnswer) {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void lossGame(int playerAnswer) {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void winGame() {
        System.out.println("Congratulations, " + playerName + "!");
    }
}
