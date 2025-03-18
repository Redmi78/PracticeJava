package collectionsk;

import java.util.HashMap;
import java.util.Map;

public class collectionsk {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("tesst",1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
