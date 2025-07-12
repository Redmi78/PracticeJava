package JavaInterViewPrograms;

public class fibSeries {
    public static void main(String[] args)
    {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b = 1, c;

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // Print the current term
            c = a + b; // Calculate the next term
            a = b; // Update a to the next term
            b = c; // Update b to the next term
        }
    }
}
