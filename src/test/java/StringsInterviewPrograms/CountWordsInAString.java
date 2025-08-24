package StringsInterviewPrograms;

import java.util.HashMap;

public class CountWordsInAString {
    public static void main(String[] args) {
        String str = "I am learning Java programming language";
        String[] words = str.split(" ");
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(!map.containsKey(words[i]))
            {
                map.put(words[i],1);
            }
            else
            {
                map.put(words[i],map.get(words[i])+1);
            }
        }
        for(String w: map.keySet())
        {
            System.out.println(w+"  "+map.get(w));
        }
    }
}
