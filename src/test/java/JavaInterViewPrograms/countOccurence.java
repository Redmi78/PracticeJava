package JavaInterViewPrograms;

import java.util.HashMap;
import java.util.Map;

public class countOccurence {
        public static void main(String[] args) {
        String str = "Madam";
        Map<Character,Integer> map = new HashMap<>();
            char[] countCharacters=  str.toCharArray();
            for(char c: countCharacters) {
               if(map.containsKey(c))
               {
                   map.put(c,map.get(c)+1);
               }
               else {
                     map.put(c,1);
               }
            }
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
            }

    }
}
