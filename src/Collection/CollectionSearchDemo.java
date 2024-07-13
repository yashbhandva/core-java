package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("K");
        l.add("M");
        l.add("Z");
        l.add("C");
        l.add("B");
        l.add("W");
        l.add("N");
        l.add("P");

        System.out.println("before sorting = "+l);
        Collections.sort(l);
        System.out.println("after sorting = "+l);
        int x = Collections.binarySearch(l,"Z");
        System.out.println(x);
    }
}
