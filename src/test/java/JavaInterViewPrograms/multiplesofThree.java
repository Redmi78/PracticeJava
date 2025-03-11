package JavaInterViewPrograms;

public class multiplesofThree {
    public static void main(String args[]) {
        int num = 12369;
        int digit;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                sum = sum + digit;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
