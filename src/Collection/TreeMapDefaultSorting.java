package Collection;

import java.util.TreeMap;

public class TreeMapDefaultSorting {
    public static void main(String[] args) {
        TreeMap<Integer,String> st = new TreeMap<>();
        st.put(109,"john");
        st.put(102,"jack");
        st.put(105,"tom");
        st.put(107,"jerry");
        st.put(101,"kanji");

        System.out.println(st);
    }
}
