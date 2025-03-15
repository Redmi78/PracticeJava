package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class countWords2 {
    public static void main(String[] args) {
        String str = "its a very happy day day";
        String[] countWords = str.split(" ");
        Integer count = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i <countWords.length; i++) {
            if (!map.containsKey(countWords[i])) {
                map.put(countWords[i], count);
            } else {
                map.put(countWords[i], map.get(countWords[i]) + 1);
            }
        }
        for (String value : map.keySet()) {
            System.out.println("count words "+ value + " "+ map.get(value));
        }

    }

}
