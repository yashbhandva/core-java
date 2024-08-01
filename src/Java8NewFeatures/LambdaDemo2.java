package Java8NewFeatures;

@FunctionalInterface
interface Demo2{
    void sum(int a,int b);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        Demo2 d = (a, b) -> System.out.println(a+b);
        d.sum(10,20);
    }
}
