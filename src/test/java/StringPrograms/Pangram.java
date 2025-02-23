
package StringPrograms;
import java.util.HashSet;
public class Pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dogk"; // Example sentence
        sentence = sentence.toLowerCase(); // Convert the sentence to lowercase

        HashSet<Character> set = new HashSet<>();

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Add alphabetic characters to the set
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        // Check if the set contains all 26 letters
        if (set.size() == 26) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is not a Pangram.");
        }
    }
}
