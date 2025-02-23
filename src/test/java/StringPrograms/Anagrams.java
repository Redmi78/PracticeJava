package StringPrograms;

import javax.swing.text.StyledEditorKit;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="SUBBA";
        String str2="UBBAS";
       if(str1.length()==str2.length())
       {
           char[] ch = str1.toCharArray();
           char[] ch2 = str2.toCharArray();
           Arrays.sort(ch);
           Arrays.sort(ch2);
         Boolean compare= Arrays.equals(ch,ch2);
         if(compare)
         {
             System.out.println(str1 + "and"+str2 + "are anagrams");
         }
         else
         {
             System.out.println(str1 + "and"+str2 + "are Not anagrams");
         }

       }
       else {
           System.out.println("string length not equal");
       }
    }
}
