package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void gameEven() {
        Greet.greetPlayer();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        var count = 0;

        for (var i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(99);
            boolean isRandomNumberEven = ((randomNumber % 2) == 0);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            playerAnswer = playerAnswer.toLowerCase();

            if (isRandomNumberEven) {
                if (playerAnswer.equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
                    Player.lossGame();
                    break;
                }
            } else {
                if (playerAnswer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'no'.");
                    Player.lossGame();
                    break;
                }
            }
        }
        if (count == 3) {
            Player.winGame();
        }
    }
}
