import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        if (length < word.length()){
            System.out.println("Result: " + word.substring(word.length() - length));
        }else {
            throw new IndexOutOfBoundsException("The length entered is greater than the word itself");
        }
    }
}
