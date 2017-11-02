import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statement: ");
        System.out.println(" \t add - adds a word pair to the dictionary \n\t " +
                "translate - asks a word and prints its translation \n\t " +
                "quit - quit the text user interface");
        System.out.println();
        String statement;
        String inFinnish;
        String translation;
        do {
            System.out.print("Statement: ");
            statement = reader.nextLine();

            if (statement.equals("quit")){
                break;

            }else if(statement.equals("add")){
                System.out.print("In Finnish: ");
                inFinnish = reader.nextLine();
                System.out.print("Translation: ");
                translation = reader.nextLine();
                dictionary.add(inFinnish, translation);

            }else if (statement.equals("translate")){
                System.out.print("Give a word: ");
                inFinnish = reader.nextLine();
                System.out.println("Translation : " + dictionary.translate(inFinnish));

            }else{
                System.out.println("Unknown statement");
            }
            System.out.println();
        }while (true);

        System.out.println("Cheers!");
    }
}
