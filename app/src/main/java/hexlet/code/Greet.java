package hexlet.code;

public class Greet {
    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        Player.askName();
        System.out.println("Hello, " + Player.getName() + "!");
    }
}
