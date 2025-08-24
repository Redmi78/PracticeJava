package JavaInterViewPrograms;

public class countLastWordInStrings {
    public static void main (String[] args)
    {
        String str="hello world  ";
        int count=0;
       String str1= str.trim();//remove start and end spaces
       char inputArray[] = str1.toCharArray();
       for(int i =inputArray.length-1;i>=0;i--)
       {
           if(inputArray[i]!=' ')
           {
               count=count+1;
           }
           else {
               if(count>0)
               {
                   System.out.println(count);
               }
           }
       }


    }
}
