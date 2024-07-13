package Collection;

import java.util.TreeSet;

public class NavigableSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1000);
        t.add(2000);
        t.add(3000);
        t.add(4000);
        t.add(5000);

        System.out.println(t);
        System.out.println(t.floor(3000));
        System.out.println(t.lower(3000));
        System.out.println(t.ceiling(4000));
        System.out.println(t.higher(4000));
        System.out.println("removeFirst element :"+t.removeFirst());
        System.out.println("removeLast element :"+t.removeLast());
        System.out.println("descendingSet is = "+t.descendingSet());
        System.out.println(t);
    }
}
