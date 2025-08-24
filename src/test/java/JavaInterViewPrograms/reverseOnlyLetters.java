package JavaInterViewPrograms;

public class reverseOnlyLetters {
    public static void main(String args[]) {
        String str="1ba2";
        int left=0;
        int right =str.length()-1;
        char intPutaArray[] = str.toCharArray();
     while(left<right)
     {
         if(!Character.isLetter(intPutaArray[left]))
         {
             left++;
         }

        else if(!Character.isLetter(intPutaArray[right]))
         {
             right--;
         }
        else
         {
                char temp = intPutaArray[left];
                intPutaArray[left] = intPutaArray[right];
                intPutaArray[right] = temp;
                left++;
                right--;
         }
     }

         System.out.println(intPutaArray);
    }
}
