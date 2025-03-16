package StringPrograms;


import java.util.LinkedHashMap;
import java.util.Map;

public class findNonrepitativeCharacter {
    public static void main(String[] args) {
        String str ="subba";
        Map<Character,Integer> map = new LinkedHashMap<>();
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),count);
            }
            else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        for(Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() == 1) {
                System.out.println("character value" + value + " " + value.getKey());
            }

        }
    }
}
