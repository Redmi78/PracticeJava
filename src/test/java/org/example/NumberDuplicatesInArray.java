package org.example;

public class NumberDuplicatesInArray {
    public static void main(String[] args) {

        int a[] = {10, 11, 12, 123, 12};
        int num = 12;
        int count=0;
        for(int x:a){
            if(num==x)
            {
                count++;
            }

        }
        System.out.println("count"+ count);
        String s = new String("subba");
        s.concat("reddy");
        System.out.println(s);
    }


}