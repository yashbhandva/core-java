// byte can be promoted to short, int, long, float, or double
package ObjectOrientedPrograming;

class Test{
    public void m1(int i){
        System.out.println("Int args");
    }
    public void m1(float f){
        System.out.println("float args");
    }
    public void m1(){
        System.out.println("no args");
    }
}
public class PromotedOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1(10);
        t.m1();
    }
}
