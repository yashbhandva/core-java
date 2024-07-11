package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(1);
        ls.add(3);
        ls.add(4);
        ls.add(2);
        ls.add(8);
        ls.add(null);

        System.out.println(ls.add(null));
        System.out.println(ls);
    }
}
