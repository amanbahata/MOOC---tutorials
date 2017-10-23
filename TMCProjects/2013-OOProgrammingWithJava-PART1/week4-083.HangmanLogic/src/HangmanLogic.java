import java.util.ArrayList;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    /**
     * functionality for making a guess. If the letter has already been guessed, nothing happens
     * it the word does not contains the guessed letter, number of faults increase
     * the letter is added among the already guessed letters
     * @param letter
     */

    public void guessLetter(String letter) {
        if (!word.contains(letter) && !guessedLetters.contains(letter)){
            numberOfFaults++;
        }
        if (!guessedLetters.contains(letter)){
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++){
            String letter = "" + word.charAt(i);
            if (guessedLetters.contains(letter)){
                hiddenWord += letter;
            }else {
                hiddenWord += "_";
            }
        }

        // return the hidden word at the end
        return hiddenWord;
    }
}
