package StringsInterviewPrograms;

public class ReverseVowelsInAString {
    public static void main(String[] args) {
        String str = "hello";
        String vowels = "aeiouAEIOU";
        char[] c = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
         if(vowels.indexOf(c[left])==-1)
         {
             left++;
         }
         else if(vowels.indexOf(c[right])==-1)
         {
             right--;
         }
         else {
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