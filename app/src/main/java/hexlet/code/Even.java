package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    //private static int countOfWrightAnswers = 0;
    public static void gameEven() {
        Greet.greetPlayer();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (var i = 0; i <= 3; i++) {
            int randomNumber = random.nextInt();
            boolean isRandomNumberEven = ((randomNumber % 2) == 0);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            playerAnswer = playerAnswer.toLowerCase();

            switch (isRandomNumberEven) {
                case true:
                   if (playerAnswer.equals("yes")) {
                       System.out.println("Correct!");
                   } else {
                       System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
                   }
                   break;
                case false:
                    if (playerAnswer.equals("no")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'no'.");
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + Greet.getPlayerName());
    }
}
