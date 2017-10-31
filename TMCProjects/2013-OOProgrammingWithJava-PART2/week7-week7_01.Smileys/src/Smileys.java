
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Arto");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString){
        int strLength = characterString.length();
        if (strLength % 2 != 0){
            characterString += " ";
        }
        characterString = ":) " + characterString + " :)";

        for (int i = 0; i < 3; i++){
            if (i == 0 || i == 2){
                for (int k = 0; k < characterString.length() / 2 ; k++){
                    System.out.print(":)");
                }
                System.out.println();
            }
            if (i == 1){
                System.out.println(characterString);
            }
        }
    }

}
