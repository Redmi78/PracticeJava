package StringPrograms;

public class ArmstrongNumber {
    public static void main(String args[]) {
        int num=153;
        int digit,sum=0;
        int temp=num;
        while (num!=0)
        {
            digit = num %10;
            sum =sum+digit*digit*digit;
            num=num/10;

        }
        System.out.println(temp==sum);

    }
}
