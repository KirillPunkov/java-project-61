package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    //int randomNumber() { return Random.nextInt(99);}
    //private static String correctAnswer;
    private static int count = 0;

    private static int generatedTask = 0;


    //public static String correctAnswer;


    public static void gameEven() {
        Engine.greetPlayer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 0; i < 3; i++) {
            generatedTask = Random.nextInt(99);
            String correctAnswer = (generatedTask % 2) == 0 ? "yes" : "no";
            if (Engine.gameDialog(generatedTask, correctAnswer)) {
                count++;
            } else {
                break;
            }
        }

        if (count == 3) {
            Engine.winGame();
        } else {
            Engine.lossGame();
        }
    }
}



/*
        var count = 0;

        for (var i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(99);
            //boolean isRandomNumberEven = ((randomNumber % 2) == 0);
            Engine.setStringCorrectAnswer(((randomNumber % 2) == 0) ? "yes" : "no");
            System.out.println("Question: " + randomNumber);


            System.out.print("Your answer: ");
            var playerAnswer = scanner.next();
            playerAnswer = playerAnswer.toLowerCase();

            if (playerAnswer.equals(Engine.getStringCorrectAnswer())) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    Engine.lossGame(playerAnswer);
                    break;
                }
            }
        if (count == 3) {
            Engine.winGame();
        }
        }
    }
*/
