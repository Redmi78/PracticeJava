package patterenPrograms;

public class NumbersPatteren {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        int n = 10;
        for (int i = 1; i <= n; i++) {
            // Inner loop to print the decreasing numbers starting from (n - i)
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }

            }
            System.out.println();
        }


    }
}
