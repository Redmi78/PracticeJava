package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stream1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("banana");
        names.add("apple");
        names.add("mango");
        names.add("grapes");

       /* for(String s : names) {
            System.out.println(s);
        }*/

        //names.stream().forEach(s -> System.out.println(s) );
names.stream().filter(s ->s.startsWith("b")).forEach(s -> System.out.println(s) );
    }
}
