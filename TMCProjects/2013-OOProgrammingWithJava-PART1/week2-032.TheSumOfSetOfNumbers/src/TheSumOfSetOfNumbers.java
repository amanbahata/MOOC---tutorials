
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what?: ");
        int input = Integer.parseInt(reader.next());
        int sum = 0;
        int counter = 0;

        while (counter <= input){
            sum += counter;
            counter++;
        }
        System.out.println("Sum is: " + sum);

    }
}
