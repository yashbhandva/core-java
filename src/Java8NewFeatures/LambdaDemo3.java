package Java8NewFeatures;

@FunctionalInterface
interface Demo3{
    int square(int n);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        Demo3 d = (int n) -> {
          return n*n;
        };
        System.out.println(d.square(3));
    }
}
