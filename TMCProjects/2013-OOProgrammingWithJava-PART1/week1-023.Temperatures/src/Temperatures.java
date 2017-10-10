
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.

        System.out.print("Enter a floating number: ");
        while (reader.hasNext()) {
            double input = Double.parseDouble(reader.next());
            if (input > -31 && input < 41){
                Graph.addNumber(input);
            }
        }
    }
}