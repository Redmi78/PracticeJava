package interviews;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.contains("E"));
        for(String s:list){
            System.out.println(s);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
