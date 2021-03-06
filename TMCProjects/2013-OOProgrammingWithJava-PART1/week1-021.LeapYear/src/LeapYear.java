
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.next());

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;
        }
        if (year % 100 == 0){
            isLeapYear = false;
            if (year % 400 == 0){
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not leap year.");
        }
    }
}
