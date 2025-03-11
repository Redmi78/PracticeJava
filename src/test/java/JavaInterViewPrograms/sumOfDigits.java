package JavaInterViewPrograms;

public class sumOfDigits {
    public static void main(String args[]) {
        int num = 123456;
        int digit;
        int sum = 0;
        while (num != 0) {
            digit = num % 10; //% remainder modules operator
            System.out.print(digit);
            sum = sum + digit;

            num = num / 10; //quotient operator

        }
        System.out.print("sum"+sum);

    }
}
