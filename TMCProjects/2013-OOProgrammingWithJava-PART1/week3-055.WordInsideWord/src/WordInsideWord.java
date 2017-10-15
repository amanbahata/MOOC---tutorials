
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();

        boolean found  = false;
        int j = 0;
        int i = firstWord.indexOf(secondWord.charAt(j));

        while (j < secondWord.length()){
            if (firstWord.charAt(i) == secondWord.charAt(j)){
                found = true;
                i++;
                j++;
            }else{
                found = false;
                break;
            }
        }

        if (found){
            System.out.print("The word \'" + secondWord  + "\' is found in the word \'" + firstWord + "\'");
        }else {
            System.out.print("The word \'" + secondWord  + "\' is not found in the word \'" + firstWord + "\'");
        }

    }
}
