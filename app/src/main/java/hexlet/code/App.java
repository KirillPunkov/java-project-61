/*
This "App" class is the entry point to the application and
implements the logic of the menu, with the display of available
options for selecting the desired application action: displaying
a greeting, launching a specific game, or exiting the application.

At startup, the message is displayed:
"Please enter the game number and press Enter."

After that, a list of available actions is displayed, for example:
1 - Great
0 - Exit

At the bottom of the list, a line with the text and the user's choice
of the desired action number is displayed, for example:
Your choice: 1

After confirming the selection by pressing the "Enter" key, the desired
class is launched, implementing the necessary action. The only exception
is the selection of the exit number (0), which executes the "break"
instruction inside this class.
 */

package hexlet.code;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choiceNumber = scanner.nextInt();
        System.out.println(" ");

        switch (choiceNumber) {
            case 0:
                break;
            case 1:
                Engine.greetPlayer();
                break;
            case 2:
                Even.gameEven();
                //break;
            default:
                break;
        }
    }
}
