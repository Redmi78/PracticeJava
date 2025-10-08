package jatin;

public class reverseInteger {
    public static void main(String[] args)
    {
        int number = 1324;
        int lastDigit;
        int reversNumber=0;
        while (number!=0)
        {
            lastDigit=number%10;
            reversNumber=(reversNumber*10)+lastDigit;
            number=number/10;
        }
        System.out.println(reversNumber);
    }
}
