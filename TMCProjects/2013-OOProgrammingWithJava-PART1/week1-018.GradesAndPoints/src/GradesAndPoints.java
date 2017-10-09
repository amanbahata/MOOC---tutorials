
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int point = Integer.parseInt(reader.next());

        if (0 <= point && point <= 29){
            System.out.println("fail");
        }else if (30 <= point && point <= 34){
            System.out.println("1");
        }else if (35 <= point && point <= 39){
            System.out.println("2");
        }else if (40 <= point && point <= 44){
            System.out.println("3");
        }else if (45 <= point && point <= 49){
            System.out.println("4");
        }else if (50 <= point && point <= 60){
            System.out.println("5");
        }



    }
}
