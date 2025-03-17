package Arras;

import java.util.HashSet;

public class duplicatesInArray {
    public static void main(String[] args) {
        int[] a ={1,4,5,6,8,4};
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(hs.contains(a[i]))
            {
System.out.println(a[i]);
            }
            else
            {
              System.out.println(hs.add(a[i]));
            }
        }
    }
}
