
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double num1 = Double.parseDouble(reader.next());
        System.out.println("Type another number: ");
        double num2 = Double.parseDouble(reader.next());

        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1/num2));

    }
}
