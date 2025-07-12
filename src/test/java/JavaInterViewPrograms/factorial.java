package JavaInterViewPrograms;

public class factorial {
    public static void main(String args[]) {
        int num = 5; // Change this to calculate factorial of a different number
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply the current value of factorial by i
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
