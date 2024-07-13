package Collection;

import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}

class Comp implements Comparator<Integer>{

    public int compare(Integer o1, Integer o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i2.compareTo(i1);
    }
}
public class ArraysSorting {
    public static void main(String[] args) {
        Integer[] a = {10,8,5,3,1,9,7,4};

        System.out.println("primitive array before sorting ");
        for (int a1:a){
            System.out.print(a1+" ");
        }

        System.out.println();
        System.out.println();
        Arrays.sort(a);
        System.out.println("primitive array after sorting ");
        for (int a1:a){
            System.out.print(a1+" ");
        }

        System.out.println();
        System.out.println();
        Arrays.sort(a,new Comp());
        System.out.println("primitive array after sorting by comparator");
        for (int a1:a){
            System.out.print(a1+" ");
        }

        System.out.println();
        System.out.println();
        String[] s = {"A","G","T","E","J","Q","Y"};
        System.out.println("object array before sorting ");
        for (String s1:s){
            System.out.print(s1+" ");
        }

        System.out.println();
        System.out.println();
        Arrays.sort(s);
        System.out.println("object array after sorting ");
        for (String s1:s){
            System.out.print(s1+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("object array before sorting by comparator ");
        Arrays.sort(s,new MyComp());
        for (String s1:s){
            System.out.print(s1+" ");
        }
    }
}
