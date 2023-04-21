package hexlet.code.games;
import hexlet.code.Engine;
public class Even {
    private static int count = 0;
    private static int generatedTask = Engine.getRandomNumber();
    private static String correctAnswer;

    public static void gameEven() {
        Engine.greetPlayer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 0; i < 3; i++) {
            correctAnswer = (generatedTask % 2) == 0 ? "yes" : "no";
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
