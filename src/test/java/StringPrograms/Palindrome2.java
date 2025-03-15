package StringPrograms;

public class Palindrome2 {
    public static void main(String[] args) {
        String str ="madam";
        String reve="";
        for(int i=str.length()-1;i>=0;i--)
        {

            reve = reve + str.charAt(i);

        }
        if(reve.equals(str))
        {
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
