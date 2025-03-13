package JavaInterViewPrograms;

public class duckNumber {
    public static void main(String args[]) {
        int num = 19773;
        int digit;
        boolean isDuckNumber = false;
        while (num != 0) {
            digit = num % 10;
            if (digit == 0) {
                isDuckNumber = true;
            break;
        }
        num = num / 10;
    }
    if(isDuckNumber)
    {
System.out.println("number is duck");
    }
    else
    {
        System.out.println("number is NOT duck");
    }
}
}