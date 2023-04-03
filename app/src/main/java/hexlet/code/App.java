package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choiceNumber = scanner.nextInt();
        System.out.println(" ");

        switch (choiceNumber) {
            case 0:
                break;
            case 1:
                Greet.greetPlayer();
                break;
            case 2:
                Even.gameEven();
                break;
            default:
                break;
        }
    }
}

