package Collection;

import java.util.LinkedHashMap;
import java.util.HashMap;

class LinkedHashMaps{
    public void show(){
        LinkedHashMap<Integer,String> lm = new LinkedHashMap<>();
        lm.put(101,"vijay");
        lm.put(102,"shyam");
        lm.put(103,"jack");
        lm.put(104,"john");
        lm.put(105,"tom");

        System.out.println(lm);
    }
    public void show1(){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(101,"vijay");
        hm.put(102,"shyam");
        hm.put(103,"jack");
        hm.put(104,"john");
        hm.put(105,"tom");

        System.out.println(hm);
    }
}

public class HashMaps {
    public static void main(String[] args) {
        LinkedHashMaps ll = new LinkedHashMaps();
        ll.show();
        ll.show1();
    }
}
