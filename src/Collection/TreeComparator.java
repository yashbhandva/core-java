package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        Integer m1 = o1;
        Integer m2 = o2;

        if(m1<m2){
            return +1;
        } else if (m1>m2) {
            return -1;
        }
        else
            return 0;
    }
}
public class TreeComparator {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());
        t.add(10);
        t.add(20);
        t.add(5);
        t.add(0);
        t.add(15);
        t.add(25);
        t.add(30);

        System.out.println(t);
    }
}
