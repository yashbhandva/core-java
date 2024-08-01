package Java8NewFeatures;

@FunctionalInterface
interface Demo1{
    void Show();
}
public class LambdaDemo1 {
    public static void main(String[] args) {
        Demo1 d = ()-> System.out.println("hello");
        d.Show();
    }
}
