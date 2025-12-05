package jatin;

public class ReverseVowels {
    public static void main(String[] args) {
        String input= "subba";
        String vowel ="aeiouAEIOU";
      char inputArray[] =  input.toCharArray();
      int left=0,right=inputArray.length-1;
      while(left<right)
      {
          if(vowel.indexOf(inputArray[left])==-1)
          {
              left++;
          }
          else if(vowel.indexOf(inputArray[right])==-1)
          {
              right--;
          }
          else {
              char temp;
              temp=inputArray[left];
              inputArray[left] =inputArray[right];
              inputArray[right]=temp;
              left++;
              right--;
          }

      }
      System.out.println(input);
        System.out.println(new String(inputArray));
    }
}
