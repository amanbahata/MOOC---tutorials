import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> wordList;

    public Dictionary(){
        this.wordList = new HashMap<String, String>();
    }

    public String translate(String word){
        word = sanitizeWord(word);
        return this.wordList.get(word) ;
    }


    public void add(String word, String translation){
        word = sanitizeWord(word);
        translation = sanitizeWord(translation);

        if (this.wordList.containsKey(word)){
            System.out.println("Translation of " + word + " already exists in the dictionary");
        }else {
            this.wordList.put(word, translation);
        }
    }

    private String sanitizeWord(String word){
        word = word.trim();
        word = word.toLowerCase();
        return word;
    }

    public int amountOfWords(){
        return this.wordList.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for (String key : wordList.keySet()) {
            list.add(key + " = " + wordList.get(key));
        }
        return list;
    }


}
