package coreJava;

import java.util.ArrayList;
import java.util.List;

class GenericBasic{
    public void show(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("!");
        System.out.println(list);
    }
    public void show2(){
        List newList = new ArrayList();
        newList.add(24);
        newList.add("hello");
        newList.add(25.24);
        System.out.println(newList);
    }
}
public class genericBasics {
    //use fo type sefty

    public static void main(String[] args) {
        GenericBasic genericBasic = new GenericBasic();
        genericBasic.show();
        genericBasic.show2();
    }
}
