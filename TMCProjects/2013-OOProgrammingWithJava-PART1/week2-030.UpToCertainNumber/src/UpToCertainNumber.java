
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number: ");
        int input = Integer.parseInt(reader.next());
        int counter = 1;

        while (counter <= input){
            System.out.println(counter);
            counter++;
        }
        
    }
}
