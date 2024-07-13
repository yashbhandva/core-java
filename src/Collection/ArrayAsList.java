package Collection;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        Integer[] a = {1,4,7,3,6,43,9};
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);

        a[0] = 100;
        list.set(1,200);
        System.out.println(list);

        //list.add(300); -->UnsupportedOperationException
        //list.remove(3); -->UnsupportedOperationException
    }
}
