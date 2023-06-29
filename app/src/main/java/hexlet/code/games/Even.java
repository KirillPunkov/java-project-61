package hexlet.code.games;
import hexlet.code.Engine;
public class Even {
    private static int count = 0;

    public static void gameEven() {
        Engine.greetPlayer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 0; i < 3; i++) {
            int generatedTask = Engine.getRandomNumber();
            String playerName = Engine.getPlayerName();
            String correctTextAnswer = (generatedTask % 2) == 0 ? "yes" : "no";
            Engine.question(generatedTask);
            System.out.print("Your answer: ");
            String playerTextAnswer = Engine.getPlayerTextAnswer();
            if (Engine.isPlayerAnswerCorrect(playerTextAnswer, correctTextAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                Engine.gameOver(playerName, playerTextAnswer, correctTextAnswer);
                break;
            }
        }
        if (count == 3) {
            Engine.winGame();
        }
    }
}
