package hexlet.code;

import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    private static String playerName;

    public static void askPlayerName() {
        System.out.print("May I have your name? ");
        playerName = scanner.next();
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void lossGame() {
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void winGame() {
        System.out.println("Congratulations, " + playerName + "!");
    }
    public static void game() {
        Greet.greetPlayer();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        var receivedNumber = 0;
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
                    Engine.lossGame();
                    break;
                }
            } else {
                if (playerAnswer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was 'no'.");
                    Engine.lossGame();
                    break;
                }
            }
        }
        if (count == 3) {
            Engine.winGame();
        }
    }
}
}
}
