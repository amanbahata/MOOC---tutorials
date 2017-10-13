
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int input;
        // program your solution here. Do not touch the above lines!

        do {
            System.out.print("Guess a number: ");
            input = Integer.parseInt(reader.nextLine());

            if (input < numberDrawn) {
                System.out.println("The number is greater");
            } else if (input == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
            } else {
                System.out.println("The number is lesser");
            }
        }while (input != numberDrawn);
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
