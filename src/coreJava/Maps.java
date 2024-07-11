package coreJava;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> Student = new HashMap<String,Integer>();
        Student.put("yash",72);
        Student.put("vijay",88);
        Student.put("chagan",99);
        Student.put("magan",91);

        for (String name:Student.keySet()){
            System.out.println(name+" : "+Student.get(name ));
        }
    }
}
