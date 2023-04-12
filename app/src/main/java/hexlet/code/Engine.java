package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    private static int randomNumber = random.nextInt(99);
    private static String playerName;
    private static int intCorrectAnswer;
    private static String stringCorrectAnswer;
    private static int intCorrectAnswer;

    private boolean isPlayerWin;

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
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + requestedTask);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            playerAnswer = playerAnswer.toLowerCase();
            if (playerAnswer.equals(correctAnswer) {
                System.out.println("Correct!");
                return true;
            } else {
                System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }



    public String getStringCorrectAnswer() {
        return stringCorrectAnswer;
    }
    public void setStringCorrectAnswer(String stringCorrectAnswer) {
        this.stringCorrectAnswer = stringCorrectAnswer;
    }

    public int getIntegerCorrectAnswer() {
        return intCorrectAnswer;
    }
    public void setIntegerCorrectAnswer(int intCorrectAnswer) {
        this.intCorrectAnswer = intCorrectAnswer;
    }

    public void lossGame(String playerAnswer) {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + stringCorrectAnswer + ".");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void lossGame(int playerAnswer) {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + intCorrectAnswer + ".");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void winGame() {
        System.out.println("Congratulations, " + playerName + "!");
    }

    int count = 0;


}
4