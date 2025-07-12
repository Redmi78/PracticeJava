package Streams;

import java.util.ArrayList;

public class Streams {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<>();
        names.add("subba");
        names.add("Reddy");
        names.add("venkata");
        names.add("karra");
        names.add("Rara");
        int count = 0;
       /* for (int i = 0; i < names.size(); i++) {
            String actualName = names.get(i);
            if (actualName.startsWith("R")) {
                count++;
            }
        }*/
       long C= names.stream().filter(s -> s.startsWith("R")).count();
        System.out.println(C);


    }
}
