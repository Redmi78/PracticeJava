package StringPrograms;

import java.util.HashMap;

public class OccurencesInAnString {
    public static void main(String[] args) {

        String sentence = "hello world"; // Example sentence
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            // Skip spaces if you don't want to count them
           /* if (ch != ' ') {
                // If the character is already in the map, increment its count, otherwise set to 1
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }*/
        }

        // Print the frequency of each character
        for (char ch : map.keySet()) {
            System.out.println(ch + ": " + map.get(ch));
        }
    }
}
