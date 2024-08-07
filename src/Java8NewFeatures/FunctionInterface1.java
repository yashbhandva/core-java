package Java8NewFeatures;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        //Function<Integer,Float> f = (Integer i) -> (float) (i*i);
        Function<Integer,Integer> f = (Integer i) ->i*i;
        System.out.println(f.apply(x));
    }
}
