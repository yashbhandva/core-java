package ObjectOrientedPrograming;

class A{
    public void m1(int... x){
        System.out.println("Papa");
    }
}
class B extends A{
    public void m1(int x){
        System.out.println("Beta");
    }
}
public class VarargsMethod {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
