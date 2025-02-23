package StringPrograms;

public class Palindrome {
    public static void main(String[] args) {
        String str ="subba";
        String rev="";
        String stringBuilder = new StringBuilder(str).reverse().toString();
        System.out.println(stringBuilder);
        if (str.equals(stringBuilder)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
//palindrme logic
        String str1 ="madam";
        for(int i= str1.length()-1;i>=0;i--)
        {
            rev=rev+str1.charAt(i);
        }
        System.out.println(rev);

        if (str1.equals(rev)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }
    }
}
