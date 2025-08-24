package StringsInterviewPrograms;

public class findLengthofLastWordInAString {
    public static void main(String[] args) {
        String str ="hello world";
        String str1=str.trim();
       char[] c= str1.toCharArray();
       int count=0;
       for(int i=c.length-1;i>=0;i--)
       {
           if(c[i]!=' ')
           {
               count=count+1;
           }
           else {
               if(count>0)
               {
                   System.out.print(count);
                   break;
               }
           }
       }
    }
}
