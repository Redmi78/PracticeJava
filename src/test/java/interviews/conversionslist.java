package interviews;

import java.util.ArrayList;
import java.util.LinkedList;

public class conversionslist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ArrayList<String> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
    }
}
