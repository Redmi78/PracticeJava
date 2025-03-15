package StringPrograms;

public class primeNumbers {

    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            int count = 0;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
