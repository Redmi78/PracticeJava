package JavaInterViewPrograms;

import java.util.HashMap;
import java.util.Map;

public class countOccurence {
        public static void main(String[] args) {
        String str = "Hello";
        Map<Character, Integer> map = new HashMap<>();
        char[] words = str.toCharArray();
        int count = 1;
        for(int i=0;i<words.length;i++)
        {
            if(!map.containsKey(words[i]))
            {
                map.put(words[i], count);
            }
            else
            {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println("Character: " + key + ", Count: " + map.get(key));
        }
    }
}
