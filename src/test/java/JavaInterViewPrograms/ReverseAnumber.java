package JavaInterViewPrograms;

public class ReverseAnumber {
    public static void main(String args[]) {
        int num = 587;
        int digit, result = 0;
        while (num != 0) {
            //This line uses the modulo operator (%) to find the last digit of num. For example:
            //When num is 1256, num % 10 equals 6 because dividing 1256 by 10 gives a remainder of 6.
            //This value is stored in the variable digit.
            digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }
        System.out.println(result);
    }
}
