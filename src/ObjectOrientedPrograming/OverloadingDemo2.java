package ObjectOrientedPrograming;
class Demo2{
    public void m1(String s){
        System.out.println("String version ");
    }
    public void m1(Object o){
        System.out.println("Object version");
    }
}
public class OverloadingDemo2 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.m1("vijay");
        d.m1(new Object());
        d.m1(null);
    }
}
