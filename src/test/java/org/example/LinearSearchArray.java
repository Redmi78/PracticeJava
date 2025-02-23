package org.example;

public class LinearSearchArray {
    public static void main(String[] args) {

        int a[] = {10, 11, 12, 123, 12};
        int num = 12;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println("number is found");
                break;
            }
        }

        for (int x : a) {
            if (x == num) {
                System.out.println("number is found2");
                break;
            }
        }
    }
}
