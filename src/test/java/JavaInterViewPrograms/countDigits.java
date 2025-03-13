package JavaInterViewPrograms;

public class countDigits {
    public static void main(String args[]) {
        int num = 526997;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;//it removes last number of digit
        }
        System.out.println(count);
    }
}
