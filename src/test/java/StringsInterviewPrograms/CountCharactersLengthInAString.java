package StringsInterviewPrograms;

import java.util.HashMap;

public class CountCharactersLengthInAString {
    public static void main(String[] args) {
        String str = "Subba Reddy";
        char[] c = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if (!map.containsKey(c[i])) {
                map.put(c[i], 1);
            } else {
                map.put(c[i], map.get(c[i]) + 1);
            }
        }
        for (Character ch : map.keySet()) {
            System.out.println(ch + " " + map.get(ch));

        }


    }
}