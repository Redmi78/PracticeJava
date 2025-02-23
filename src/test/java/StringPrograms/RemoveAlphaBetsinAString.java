package StringPrograms;

import java.util.Arrays;

public class RemoveAlphaBetsinAString {
    public static void main(String[] args) {
        String str = "Subba778Reddy1547Venkata855555Reddy";
        int left=0;
        int right=str.length()-1;
       char[] ch= str.toCharArray();
       while(left<right)
       {
           if(Character.isDigit(left)){
               left++;
           }
           else if(Character.isDigit(right))
           {
               right--;
           }
           else {
               char temp = ch[left];
               ch[left]=ch[right];
               ch[right]=temp;
               left++;
               right--;
           }
       }
       System.out.println(Arrays.toString(ch));
        
    }
}
