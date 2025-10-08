package jatin;

public class LengthofLastwordInAString {
    public static void main(String[] args)
    {
        String str ="Hello Worlds";
       String str1= str.trim();
      char arr[]= str1.toCharArray();
      int count=0;
      for(int i=arr.length-1;i>=0;i--)
      {
          if(arr[i]!=' ')
          {
              count++;
          }
          else {
              System.out.println(count);
          }
      }

    }
}
