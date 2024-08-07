package Java8NewFeatures;

import java.util.function.Predicate;

//class test1{
//    public boolean EvenOdd(int i){
//        if (i%2==0){
//            return true;
//        }
//        else
//            return false;
//    }
//}
public class PredicateFunctionDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> p = (Integer i) -> i%2==0;
        boolean x = p.test(2);
        System.out.println(x);
        System.out.println(p.test(3));
    };
}
