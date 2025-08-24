package StringsInterviewPrograms;

public class ReverseWordsInaString {
    public static void main(String[] args) {

        String str="the sky is blue";
        String[] s=str.split(" ");
        String rev="";
        for(int i=s.length-1;i>=0;i--)
        {
            rev=rev+s[i]+"";
        }
        System.out.println(rev.trim());
    }
}
