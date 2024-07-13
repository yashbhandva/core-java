//default natural sorting order
package Collection;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionsSortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(8);
        l.add(5);
        l.add(7);
        l.add(9);

        // l.add(null); -->NullPointerException

        System.out.println("before sorting : "+l);
        Collections.sort(l);
        System.out.println("after sorting : "+l);

    }
}
