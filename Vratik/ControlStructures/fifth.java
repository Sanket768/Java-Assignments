/* 5. Write a program to categorize a character as a vowel, consonant, or neither (like digits
or symbols). */
class CharacterCategorizer {
    private char character;

    public CharacterCategorizer(char character) {
        this.character = character;
    }

    public String categorize() {
        if (Character.isLetter(character)) {
            if (Character.toLowerCase(character) == 'a' || Character.toLowerCase(character) == 'e'
                    || Character.toLowerCase(character) == 'i' || Character.toLowerCase(character) == 'o'
                    || Character.toLowerCase(character) == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Neither";
        }
    }
}

public class fifth {
    public static void main(String[] args) {
        CharacterCategorizer categorizer = new CharacterCategorizer('A');
        System.out.println(categorizer.categorize()); // Output: Vowel
    }
}
