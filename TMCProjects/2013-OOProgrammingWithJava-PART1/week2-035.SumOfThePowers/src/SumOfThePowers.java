
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int counter = 0;

        while (counter <= input){
            sum += (int) Math.pow(2, counter);
            counter++;
        }

        System.out.println("The result is: " + sum);

    }
}
