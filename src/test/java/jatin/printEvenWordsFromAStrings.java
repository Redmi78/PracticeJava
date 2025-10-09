package jatin;

public class printEvenWordsFromAStrings {
    public static void main(String[] args)
    {
        String str= "sky is blue";
        String data[] =str.split(" ");
        for(String a:data)
        {
            if(a.length()%2==0)
            {
                System.out.println(a);
            }
        }
    }
}
