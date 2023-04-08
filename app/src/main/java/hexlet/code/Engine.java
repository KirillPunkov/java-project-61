package hexlet.code;

import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    private static String stringCorrectAnswer;
    private static int intCorrectAnswer;

    public static void askPlayerName() {
        System.out.print("May I have your name? ");
        playerName = scanner.next();
    }

    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Hello, " + playerName + "!");
    }
    public String getPlayerName() {
        return playerName;
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

    public void lossGame(int playerAnswer) {
        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + intCorrectAnswer + ".");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public void winGame() {
        System.out.println("Congratulations, " + playerName + "!");
    }

    int count = 0;


}
