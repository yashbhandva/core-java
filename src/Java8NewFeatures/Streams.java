package Java8NewFeatures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(71, 54, 92, 34, 10, 7, 100);
        //filter
        //Predicate<Integer> val = integer -> {
        //       if (integer%2==0)
        //            return true;
        //        else
        //            return false;
        //    };


        //Function<Integer,Integer> val = new Function<Integer, Integer>() {
        //    @Override
        //    public Integer apply(Integer integer) {
        //        System.out.println(integer*2);
        //        return integer;
        //    }
        //};
        int val = list.stream()
                .filter(n->n%1 == 0)
                .sorted()
                .map(n->n*2)
                .reduce(0 ,(a, b)->a+b);
        System.out.println(val);
    }
}
