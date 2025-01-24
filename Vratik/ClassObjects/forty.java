/*
 * Create a Dictionary class that stores word-meaning pairs using HashMap.
 */

import java.util.HashMap;

public class forty {
    private HashMap<String, String> dictionary;

    public forty(){
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning){
        dictionary.put(word,meaning);
    }

    public String getMeaning(String word){
        return dictionary.get(word);
    }

    public void displayDictionary(){
        for(String word: dictionary.keySet()){
            System.out.println("Word: " + word + ", Meaning: " + dictionary.get(word));
        }
    }

    public static void main(String[] args) {
        forty dictionary = new forty();

        dictionary.addWord("Java", "A high-level programming languange.");
        dictionary.addWord("JavaScript", "A Scripting language");
        dictionary.displayDictionary();
    }
}
