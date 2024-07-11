package Collection;

import java.util.HashMap;

public class identityHashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        Integer i1 = 10;
        Integer i2 = 10;

        m1.put(i1,"vijay");
        m1.put(i2,"shyam");

        System.out.println(m1);
    }
}
