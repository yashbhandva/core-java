package Java8NewFeatures;

interface A{
    void m1();
    void m2();
}
public class AnonymousInnerClassDemo1 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void m1() {
                System.out.println("m1 method");
            }

            @Override
            public void m2() {
                System.out.println("m2 method");
            }
        };
        a.m1();
        a.m2();
    }
}
