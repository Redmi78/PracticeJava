package JavaInterViewPrograms;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str = "subba";
        String str1 = "ubbas";
      char[] s=  str1.toLowerCase().toCharArray();
        char[] s1=  str.toLowerCase().toCharArray();
        Arrays.sort(s);
        Arrays.sort(s1);
        if(Arrays.equals(s, s1)) {
            System.out.println(str + " and " + str1 + " are anagrams");
        } else {
            System.out.println(str + " and " + str1 + " are not anagrams");
        }

        //reverse a string
        String test="subbareddy";
        String rev= " ";
        for(int i=test.length()-1;i>0;i--){
            rev= rev + test.charAt(i);
        }
        System.out.println("reverse string"+ rev);
    }
}