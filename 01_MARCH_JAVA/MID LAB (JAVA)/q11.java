import java.util.*;

class WordExample {
    private String strData;

    // Parameterized constructor
    public WordExample(String strData) {
        this.strData = strData.toUpperCase();
    }

    // Method to count words beginning and ending with a vowel
    public void countWord() {
        String[] words = strData.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
                if (word.endsWith("A") || word.endsWith("E") || word.endsWith("I") || word.endsWith("O") || word.endsWith("U")) {
                    count++;
                }
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    // Method to place words which begin and end with a vowel at the beginning
    public void placeWord() {
        String[] words = strData.split("\\s+");
        List<String> vowelWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();

        for (String word : words) {
            if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
                if (word.endsWith("A") || word.endsWith("E") || word.endsWith("I") || word.endsWith("O") || word.endsWith("U")) {
                    vowelWords.add(word);
                } else {
                    otherWords.add(word);
                }
            } else {
                otherWords.add(word);
            }
        }

        vowelWords.addAll(otherWords);
        strData = String.join(" ", vowelWords);
        System.out.println("Sentence after placing words beginning and ending with a vowel at the beginning: " + strData);
    }
}
public class q11 {
  

}