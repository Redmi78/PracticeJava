package StringsInterviewPrograms;

import java.util.HashMap;

public class FirstNonRepitativeCharacterInAString {
    public static void main(String[] args) {
        String str ="testing";
        char[] c= str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if(!map.containsKey(c[i]))
            {
                map.put(c[i],1);
            }
            else
            {
                map.put(c[i],map.get(c[i])+1);
            }
        }
        for(Character ch : map.keySet())
        {
            if(map.get(ch)==1)
            {
                System.out.println("first non repitative character" + "      " +ch);
                break;
            }
        }

        for(Character ch : map.keySet())
        {
            if(map.get(ch)>=2)
            {
                System.out.println("duplicate characters  " +"     "+ ch);
            }
        }
    }
}
