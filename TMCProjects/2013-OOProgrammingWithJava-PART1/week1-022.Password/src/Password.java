
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String input;
        String secret = "Secret message!";

        // Write your code here


        System.out.print("Type the password: ");
        input = reader.nextLine();
        while (password.compareTo(input) != 0){
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            input = reader.nextLine();
        }
        System.out.println("Right!");
        System.out.println("The secret is : " + secret);


    }
}
