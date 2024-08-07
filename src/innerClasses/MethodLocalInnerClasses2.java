package innerClasses;

class D{
    int x = 10;
    static int y = 20;
    public void y1(){
        class E{
            public void y2(){
                System.out.println(x);
                System.out.println(y);
            }
        }
        E e = new E();
        e.y2();
    }
}
public class MethodLocalInnerClasses2 {
    public static void main(String[] args) {
        D d = new D();
        d.y1();
    }
}
