package Java8NewFeatures;

import java.util.Collections;
import java.util.function.IntPredicate;

public class IntPredicateFunctionDemo1 {
    public static void main(String[] args) {
        int[] x = {1,2,23,45,68,44,65,76,79,70};
        IntPredicate s = (int a) -> a%2==0;
        for (int i:x){
            if (s.test(i)){
                System.out.println(i);
            }
        }
    }
}
