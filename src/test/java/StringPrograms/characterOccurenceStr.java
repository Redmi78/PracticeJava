package StringPrograms;

import java.util.HashMap;

public class characterOccurenceStr {
    public static void main(String[] args) {
        String str = "i'm learning java programming";
       char[] c= str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<c.length;i++)
        {
            if(!map.containsKey(c[i]))
            {
                map.put(c[i],1);
            }
            else {
                map.put(c[i],map.get(c[i])+1);
            }
        }
        for(Character occur :map.keySet())
        {
            System.out.println(occur + " "+ map.get(occur));
        }

    }
}
