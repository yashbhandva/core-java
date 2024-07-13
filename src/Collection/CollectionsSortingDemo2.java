package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparatorEx implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i2.compareTo(i1);
    }
}
public class CollectionsSortingDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(8);
        l.add(5);
        l.add(7);
        l.add(9);

        System.out.println("before sorting : "+l);
        Collections.sort(l,new MyComparatorEx());
        System.out.println("after sorting : "+l);
    }
}
