package Collection;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparators implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        Integer m1 = o1;
        Integer m2 = o2;
        return m2.compareTo(m1);
    }
}
public class TreeMapReverse {
    public static void main(String[] args) {
        TreeMap<Integer,String> st = new TreeMap<>(new MyComparator());
        st.put(109,"john");
        st.put(102,"jack");
        st.put(105,"tom");
        st.put(107,"jerry");
        st.put(101,"kanji");

        System.out.println(st);
    }
}
