package Operators;

public class Operats {
    public static void main(String[] args) {
        int a=20,b=30;
        int sum= a+b;
        int diff=a-b;
        int multiply=a*b;
        int quotinet = a/b;
        int remainder=a%b;
        System.out.println(sum+ " "+diff+ " "+multiply+ " "+quotinet+ " "+remainder+ " ");

        // Relational
        boolean isEqual = (a == b); // true if a equals b
        boolean isGreater = (a > b); // true if a is greater than b

        System.out.println(isEqual+ " "+isGreater);

        if(a<b)
        {
            System.out.println("discount eligible");
        }
        else {
            System.out.println("discount not eligible");
        }

    }
}
