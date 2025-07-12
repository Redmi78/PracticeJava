package JavaInterViewPrograms;

import java.util.HashMap;

public class countwords {
    public static void main(String[] args) {
        String str = "Hello World this, is a test string World";
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split(" ");
        Integer count = 1;
        for (int i=0;i<words.length;i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], count);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }

        }
        for (String key : map.keySet()) {
            System.out.println("Word: " + key + ", Count: " + map.get(key));
        }
    }
}