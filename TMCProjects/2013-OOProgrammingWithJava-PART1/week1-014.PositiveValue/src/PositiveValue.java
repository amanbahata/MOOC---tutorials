
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.println("Type a number: ");
        Integer number = Integer.parseInt(reader.next());

        if (number <= 0){
            System.out.println("The number is not positive.");
        }else {
            System.out.println("The number is positive.");
        }
    }
}
