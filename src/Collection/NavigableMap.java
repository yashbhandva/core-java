package Collection;

import java.util.TreeMap;

public class NavigableMap {
    public static void main(String[] args) {
        TreeMap<String,String> m = new TreeMap<>();
        m.put("b","banana");
        m.put("c","cat");
        m.put("a","apple");
        m.put("d","dog");
        m.put("g","gun");

        System.out.println(m);

        System.out.println(m.ceilingEntry("e"));
        System.out.println(m.higherEntry("e"));
        System.out.println(m.floorEntry("c"));
        System.out.println(m.lowerEntry("c"));
        System.out.println("pollFirstEntry is : "+m.pollFirstEntry());
        System.out.println("pollLastEntry is : "+m.pollLastEntry());
        System.out.println(m.descendingMap());

        System.out.println(m);
    }
}
