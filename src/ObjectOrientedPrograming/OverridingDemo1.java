package ObjectOrientedPrograming;

class Parent1{
    public void property(){
        System.out.println("cash,gold....");
    }
    public void marry(){
        System.out.println("with v*****a");
    }
}
class Child1{
    public void marry(){
        System.out.println("no-marry");
    }
}
public class OverridingDemo1 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        
        c.marry();
        p.marry();
    }
}
