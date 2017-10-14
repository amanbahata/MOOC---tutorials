import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        System.out.println("In reverse order: " + textReverse(input));
    }

    public static String textReverse(String text){
        String container = "";

        for (int i = text.length() - 1;i >= 0; i-- ){
            container = container + text.charAt(i);
        }
        return container;
    }
}
