package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsRevers {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(83);
        l.add(10);
        l.add(45);
        l.add(3);

        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
