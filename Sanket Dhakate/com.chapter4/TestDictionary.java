/* Create a Dictionary class that stores word-meaning pairs using HashMap. */
import java.util.HashMap;

class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning);
    }

    public void displayDictionary() {
        for (String word : dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));
        }
    }
}

public class TestDictionary {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("Java", "A high-level programming language.");
        dictionary.addWord("ArrayList", "A resizable array implementation in Java.");
        dictionary.displayDictionary();
    }
}