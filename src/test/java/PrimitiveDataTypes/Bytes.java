package PrimitiveDataTypes;

public class Bytes {
    public static void main(String[] args) {
        //You want to validate a user's age during registration, ensuring it’s between 0 and 127 (using the byte range).
        byte b1 = 28;
        byte b2 = -128;
        byte b3 = 127;
        System.out.println(b1 + " " + b2 + " " + b3);

    }
}