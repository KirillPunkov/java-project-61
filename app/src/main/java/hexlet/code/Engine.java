package hexlet.code;
import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    private static String playerName;
    //private static
    public static int getRandomNumber() {
        int randomRangeStartNumber = 0;
        int randomRangeEndNumber = 99;
        return randomRangeStartNumber + (int) (Math.random() * randomRangeEndNumber);
    }

    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void question(int generatedTask) {
        System.out.println("Question: " + generatedTask);
    }
    private static String playerTextAnswer() {
       return scanner.next().toLowerCase();
    }

    public static String getPlayerTextAnswer() {
        return playerTextAnswer();
    }

    public static boolean isPlayerAnswerCorrect(String playerTextAnswer, String correctTextAnswer)  {
      return correctTextAnswer.equals(playerTextAnswer);
    }

    public static void winGame() {
        System.out.println("Congratulations, " + playerName + "!");
    }

    public static void gameOver(String playerName, String playerTextAnswer, String correctTextAnswer) {
        System.out.println(playerTextAnswer + " is wrong answer ;(. Correct answer was " + correctTextAnswer + ".");
        System.out.println("Let's try again, " + playerName + "!");
    }
}
