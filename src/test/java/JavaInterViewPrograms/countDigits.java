package JavaInterViewPrograms;

public class countDigits {
    public static void main(String args[]) {
        int num = 5269897;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
