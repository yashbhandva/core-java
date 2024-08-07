package innerClasses;

class A{
    class B{
        class C{
            public void y1(){
                System.out.println("hello world !");
            }
        }
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.y1();
    }
}
