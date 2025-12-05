package jatin;

import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String str= "1a3c4";
       char inputArray[] = str.toCharArray();
       int left=0,right=inputArray.length-1; char temp;
       while (left<right) {
           if (!Character.isLetter(inputArray[left])) {
               left++;
           } else if (!Character.isLetter(inputArray[right])) {
               right--;
           } else {
               temp = inputArray[left];
               inputArray[left] = inputArray[right];
               inputArray[right] =  temp;
               left++;
               right--;
           }
       }
       System.out.println(Arrays.toString(inputArray));


    }
}
