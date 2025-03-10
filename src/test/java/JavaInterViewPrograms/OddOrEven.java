package JavaInterViewPrograms;

public class OddOrEven {
    public static void main(String args[]) {
        int a = 25;
        if (a<=0) {
            System.out.println("invalid number");
        } else {

            if (a % 2 == 0) {
                System.out.println("its a even number");
            } else {
                System.out.println("its a odd number");
            }

        }
    }
}