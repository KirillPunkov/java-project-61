package hexlet.code;
import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    private static String playerAnswer;
    private static int randomRangeStartNumber = 0;
    private static int randomRangeEndNumber = 99;
    public static int getRandomNumber() {
        return randomRangeStartNumber + (int) (Math.random() * randomRangeEndNumber);
    }
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

    public static boolean gameDialog(int generatedTask, String correctAnswer)  {
        System.out.println("Question: " + generatedTask);
        System.out.print("Your answer: ");
        playerAnswer = scanner.next();
        playerAnswer = playerAnswer.toLowerCase();
        if (correctAnswer.equals(playerAnswer)) {
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
