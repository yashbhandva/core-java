package Java8NewFeatures;

import java.util.function.Function;

public class FunctionInterface2 {
    public static void main(String[] args) {
        Function<String ,Integer > f = (String s)-> s.length();
        System.out.println("length of string is : "+f.apply("hello world"));

        Function<String ,String > f1 = (String s)-> s.toUpperCase();
        System.out.println("in toUpperCase : "+f1.apply("hello world"));

        Function<String ,String  > f2 = (String s)-> s.substring(6);
        System.out.println("final substring is : "+f2.apply("hello world"));
    }
}
