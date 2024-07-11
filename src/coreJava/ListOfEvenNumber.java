package coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ListOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(54);
        list.add(63);
        list.add(85);
        list.add(22);
        list.add(43);
        list.add(75);
        list.add(90);


        List<Integer> list1 = new ArrayList<>();
        for (Integer i:list){
            if (i % 2 == 0){
                list1.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list1);

        Stream<Integer> stream = list.stream();
        List<Integer> LL = stream.filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(LL);
    }
}
