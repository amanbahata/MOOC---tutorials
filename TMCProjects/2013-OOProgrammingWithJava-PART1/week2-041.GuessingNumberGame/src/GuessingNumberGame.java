
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int input;
        int guessCounter = 1;

        do {
            System.out.print("Guess a number: ");
            input = Integer.parseInt(reader.nextLine());

            if (input < numberDrawn) {
                System.out.print("The number is greater, guesses made: " + guessCounter);
            } else if (input == numberDrawn) {
                System.out.print("Congratulations, your guess is correct!");
            } else {
                System.out.print("The number is lesser, guesses made: " + guessCounter);
            }
            guessCounter ++;
        }while (input != numberDrawn);
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
