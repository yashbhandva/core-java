package Java8NewFeatures;

import java.util.function.Consumer;

public class consumerInterface {
    public static void main(String[] args) {
        Consumer<String> s = System.out::println;
        s.accept("hello world !");
    }
}
