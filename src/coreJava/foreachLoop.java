package coreJava;

//import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
//CONSUMER INTERFACE
//public class foreachLoop {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(56,55,4,84,5,6,77,8,80,85,63);
//        Consumer<Integer> n= new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        list.forEach(n);
//    }
//}


//LAMBADA
//public class foreachLoop {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(56,55,4,84,5,6,77,8,80,85,63);
//        Consumer<Integer> n = (Integer integer)-> System.out.println(integer);
//        list.forEach(n);
//    }
//}


// FOREACH LOOP
public class foreachLoop {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(56, 55, 4, 84, 5, 6, 77, 8, 80, 85, 63);
        list.forEach(n ->
        {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}