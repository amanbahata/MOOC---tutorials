import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {

        int middle = text.length() / 2;
        int j = text.length() - 1;
        boolean flag = false;
        int i = 0;

        if (text.isEmpty() || text.length() == 1 ){
            return true;
        }

        while (i < middle){
            if (text.charAt(i) == text.charAt(j)){
                flag = true;
                i++;
                j--;
            }else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
