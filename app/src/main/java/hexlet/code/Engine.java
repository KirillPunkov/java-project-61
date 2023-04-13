package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    private static String playerAnswer;
    private boolean isPlayerWin;
    private static String correctAnswer;

    public static void askPlayerName() {
        System.out.print("May I have your name? ");
        playerName = scanner.next();
    }

    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        askPlayerName();
        System.out.println("Hello, " + playerName + "!");
    }



    public String getPlayerName() {
        return playerName;
    }

    public static boolean isPlayerAnswerCorrect(int requestedTask, String correctAnswer)  {
        System.out.println("Question: " + requestedTask);
        System.out.print("Your answer: ");
        String playerAnswer = scanner.next();
        playerAnswer = playerAnswer.toLowerCase();
        if (playerAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            }
        return true;
    }

    public static void winGame() {
        System.out.println("Congratulations, " + playerName + "!");
    }
    public static void lossGame() {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
        System.out.println("Let's try again, " + playerName + "!");
    }
}
