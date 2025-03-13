package JavaInterViewPrograms;

public class givenNumberIsPalindromeOrNot {
    public static void main(String args[]) {
        int num =58985;
        int digit,result=0;
        int temp = num;
        while(num!=0)
        {
            //This line uses the modulo operator (%) to find the last digit of num.
            digit = num%10;
            result = result*10 + digit;
            num=num/10;
        }
        if(result==temp)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
