import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 1;
        int counter = 1;

        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.next());

        if (input == 0){
            sum = 1;
        }else {
            while (counter <= input){
                sum = sum * counter;
                counter++;
            }
        }
        System.out.println("Factorial is " + sum);

    }
}
