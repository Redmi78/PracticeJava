package JavaInterViewPrograms;

public class reverseVowels {
    public static void main(String args[]) {
        String str ="Hello";
       char[] c= str.toCharArray();
       String vowels = "aeiouAEIOU";
       int left=0;
       int right=c.length-1;
               while(left<right) {
                   if(vowels.indexOf(c[left])==-1)
                   {
                   left++;
                   }
                     else if(vowels.indexOf(c[right])==-1) {
                          right--;
                     } else {
                          char temp = c[left];
                          c[left] = c[right];
                          c[right] = temp;
                          left++;
                          right--;
                     }
               }
               System.out.println(c);
    }
}
