package Java8NewFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Demo6 implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        Integer m1 = o1;
//        Integer m2 = o2;
//        return m2.compareTo(m1);
//    }
//}
public class LambdaDemo6 {
    public static void main(String[] args) {
        Comparator<Integer> i = (Integer o1, Integer o2) -> {
            Integer m1 = o1;
            Integer m2 = o2;

            return m2.compareTo(m1);
        };
        List<Integer> list = Arrays.asList(12, 344, 54, 5, 76, 89, 90);
        System.out.println("Default order list "+list);
        Collections.sort(list);
        System.out.println("Ascending order list "+list);
        Collections.sort(list, i);
        System.out.println("Descending order list "+list);
//      Collections.sort(list,new Demo6());
    }
}
