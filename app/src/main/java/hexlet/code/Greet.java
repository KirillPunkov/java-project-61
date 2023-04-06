package hexlet.code;

public class Greet {
    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        Engine.askPlayerName();
        System.out.println("Hello, " + Engine.getPlayerName() + "!");
    }
}
