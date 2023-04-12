package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private static int randomNumber;
    private static String correctAnswer;

    public void gameEven() {
        Engine.greetPlayer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        public static int requestedTask() {
            randomNumber = Random.nextInt(99);
            return randomNumber;
        }

        public static String correctAnswer() {
            return (((randomNumber % 2) == 0) ? "yes" : "no");
        }


        var count = 0;

        for (int i = 0; i < 3; i++) {
            randomNumber = Random.nextInt(99);
            correctAnswer = correctAnswer();
            Engine.isPlayerAnswerCorrect(randomNumber, correctAnswer) ? count++; break;
        }
        count == 3 ? Engine.winGame(); Engine.lossGame();


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
*/
        }
    }
