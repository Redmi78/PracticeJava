package StringPrograms;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String str = "subba reddy reddy"; // Example sentence
        // Split the sentence into words
     //   We use split("\\s+") to split the sentence into words based on spaces (handling multiple spaces between words).
        String[] words = str.split("\\s+"); // Split by spaces
        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        // Loop through each word in the array
        for (String word : words) {
            // If the word is already in the map, increment its count, otherwise set to 1
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        // Print the frequency of each word
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}


