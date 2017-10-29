import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner reader = new Scanner(System.in);

        BirdwatchersDatabase repo = new BirdwatchersDatabase();
        String command = "";

        while(!command.equals("Quit")){
            System.out.print("? ");
            command = reader.nextLine();

            if (command.equals("Add")){
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                repo.addBird(name, latinName);
            }

            if (command.equals("Observation")){
                System.out.print("What was observed? : ");
                String birdName = reader.nextLine();
                repo.addObservation(birdName);
            }

            if (command.equals("Statistics")){
                repo.statistics();
            }

            if (command.equals("Show")){
                repo.show(reader.nextLine());
            }
        }
            
    }

}
