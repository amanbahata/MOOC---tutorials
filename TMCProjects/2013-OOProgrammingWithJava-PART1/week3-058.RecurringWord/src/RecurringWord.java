
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList

        ArrayList<String> words = new ArrayList<String>();


        System.out.print("Type a word: ");
        String in = reader.nextLine();

        while (!in.isEmpty()){
            if (words.contains(in)){
                System.out.println("You gave the word " + in + " twice");
                break;
            }else {
                words.add(in);
            }
            System.out.print("Type a word: ");
            in = reader.nextLine();
        }
        
    }
}
