package Java8NewFeatures;

import java.util.function.Predicate;

public class PredicateFunctionDemo3 {
    public static void main(String[] args) {
        String[] array = {"yash","kanji","mohan","charan","ghanshyam","ram"};
//        for (String a : array){
//            System.out.println(a);
//        }
        Predicate<String> i = (String s) -> s.length()>4;
        for (String s : array){
            if (i.test(s)){
                System.out.println(s);
            }
        }
    }
}
