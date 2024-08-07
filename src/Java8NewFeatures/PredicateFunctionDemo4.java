package Java8NewFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionDemo4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,60,8,90,100,10,5,4,6,3,101,1002);
        System.out.println(list);
        Predicate<Integer> p1 = (Integer number) -> number%2 == 0;
        Predicate<Integer> p2 = (Integer number) -> number>=10;

//        for (Integer l:list){
//            if (p1.and(p2).test(l)){
//                System.out.println(l);
//            }
//        }

//        for (Integer l1:list){
//            if (p1.or(p2).test(l1)){
//                System.out.println(l1);
//            }
//        }

//        for (Integer l2 : list){
//            if (p1.negate().test(l2)){
//                System.out.println(l2);
//            }
//        }

        for (Integer l3 : list){
            if (p2.negate().test(l3)){
                System.out.println(l3);
            }
        }
    }
}
