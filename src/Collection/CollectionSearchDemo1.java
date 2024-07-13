package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(8);
        l.add(3);
        l.add(2);
        l.add(7);
        l.add(4);
        l.add(1);
        l.add(6);

        System.out.println("before sorting = "+l);
        Collections.sort(l,new MyComparatorEx());
        System.out.println("after sorting = "+l);
        System.out.println(Collections.binarySearch(l,10,new MyComparatorEx()));
        System.out.println(Collections.binarySearch(l,4,new MyComparatorEx()));

    }
}
