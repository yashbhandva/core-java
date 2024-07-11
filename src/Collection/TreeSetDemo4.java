package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Tree4 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        int m1 = s1.length();
        int m2 = s2.length();

        if(m1<m2){
            return -1;
        }
        else if (m1>m2){
            return 1;
        }
        else
            return s1.compareTo(s2);
    }
}
public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet st = new TreeSet<>(new Tree4());
        st.add("A");
        st.add("AA");
        st.add(new StringBuffer("ABC"));
        st.add(new StringBuffer("XX"));
        st.add("wxyz");
        st.add("A");

        System.out.println(st);
    }
}
