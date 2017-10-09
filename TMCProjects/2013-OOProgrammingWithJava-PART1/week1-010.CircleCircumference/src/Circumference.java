
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("Type the radius: ");
        Double radius = Double.parseDouble(reader.next());

        System.out.println("Circumference of the circle: " + radius * Math.PI * 2);
    }
}
