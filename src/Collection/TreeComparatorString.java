package Collection;

import java.util.Comparator;
import java.util.TreeSet;
class ComparatorString implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        String m1 = o1;
        String m2 = o2;
        return m2.compareTo(m1);
    }
}
public class TreeComparatorString {
    public static void main(String[] args) {
        TreeSet<String> st = new TreeSet<>(new ComparatorString());
        st.add("krishna");
        st.add("ram");
        st.add("arjuna");
        st.add("shyam");
        st.add("karna");

        System.out.println(st);
    }
}
