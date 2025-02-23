package StringPrograms;

import java.util.HashMap;

public class ReverseEachWordInaString {
    public static void main(String[] args) {

        String str = "hello world"; // Example sentence

        String[] words = str.split("\\s+");

        // Create a HashMap to store the reversed version of each word
        HashMap<Integer, String> reversedWordsMap = new HashMap<>();

        // Reverse each word and store it in the HashMap
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            // Reverse the current word without using any methods
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord =reversedWord+word.charAt(j);
            }

            // Store the reversed word in the HashMap
            reversedWordsMap.put(i, reversedWord);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(reversedWordsMap.get(i) + " ");
        }


    }
}
