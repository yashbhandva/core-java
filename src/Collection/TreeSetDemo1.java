package Collection;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<StringBuffer> bf = new TreeSet<>();
        bf.add(new StringBuffer("A"));
        bf.add(new StringBuffer("B"));
        bf.add(new StringBuffer("C"));
        System.out.println(bf);
    }
}
