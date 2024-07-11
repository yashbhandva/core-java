package Collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //    Vector<Integer> v = new Vector<>(); //-->first constructor
        Vector<Integer> v = new Vector<>(10, 5); //-->second constructor
        //    Vector<Integer> v = new Vector<>(23); //-->third constructor
        System.out.println(v.capacity());
        for (int i = 1; i < 11; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement(3);
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
