
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[][] userNamesAndPasswords = {{"alex", "mightyducks"},{"emily", "cat"}};

        System.out.println("Type your username: ");
        String user = reader.nextLine();
        System.out.println("Type your password: ");
        String password = reader.nextLine();

        boolean found = false;

        for (String[] username : userNamesAndPasswords){
            if (username[0].compareTo(user) == 0 && username[1].compareTo(password) == 0){
                found = true;
            }
        }

        if (found){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }

    }

}
