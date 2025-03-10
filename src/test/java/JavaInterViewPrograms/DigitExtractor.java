package JavaInterViewPrograms;

public class DigitExtractor {
    public static void main(String args[]) {
        int num=123456;
        int digit;
        while(num!=0)
        {
            digit = num %10; //% remainder modules operator
            System.out.print(digit);
            num= num/10; //quotient operator

        }

    }
}
