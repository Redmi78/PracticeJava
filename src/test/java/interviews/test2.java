package interviews;

import java.util.HashMap;

public class test2 {


    public static void main(String[] args) {
        String str = "testing";
        char[] c = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        // Count occurrences of each character
        for (char ch : c) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find and print the first non-repetitive character
        for (char ch : c) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repetitive character: " + ch);
                return;
            }
        }
        System.out.println("No non-repetitive character found.");

    }
}