
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        String command;

        while (hangman.gameOn()){
            System.out.print("Type a command: ");
            command = reader.nextLine();
            if (command.compareTo("quit") == 0){
                break;
            }else if (command.compareTo("status") == 0){
                hangman.printStatus();
            }else if (command.length() == 1){
                hangman.guess(command);
            }else if (command.isEmpty()){
                printMenu();
            }
            hangman.printMan();
            hangman.printWord();
        }

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
