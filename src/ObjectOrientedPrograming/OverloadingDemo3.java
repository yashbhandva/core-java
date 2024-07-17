package ObjectOrientedPrograming;
class Demo3{
    public void m1(int i,float f){
        System.out.println("int - float version ");
    }
    public void m1(float f,int i){
        System.out.println("float - int version");
    }
}
public class OverloadingDemo3 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.m1(10.5f,4);
        d.m1(10,4.5f);
    }
}
