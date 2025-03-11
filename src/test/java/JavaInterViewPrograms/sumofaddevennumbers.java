package JavaInterViewPrograms;

public class sumofaddevennumbers {
    public static void main(String args[]) {
        int num =15;
        int digit;
        int sum=0;
        while(num !=0)
        {
            digit = num %10;
            if(digit/2 ==0)
            {
                sum = sum + digit;
            }
            else {
                sum = sum + digit;
            }
            num=num/10;

        }
        System.out.print("sum"+sum);
    }
}
