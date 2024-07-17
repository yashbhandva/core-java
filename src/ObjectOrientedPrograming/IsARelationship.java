package ObjectOrientedPrograming;

class Parent{
    public void show(){
        System.out.println("My name is...");
    }
    public void show1(){
        System.out.println("how are you... ");
    }
    public void show2(){
        System.out.println("i am your parent...");
    }
}
class Child extends Parent{
    public void show3(){
        System.out.println("im your children...");
    }
}
public class IsARelationship {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
        child.show1();
        child.show3();
    }
}
