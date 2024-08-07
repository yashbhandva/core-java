package innerClasses;
class Pizza{
    public void n1(){
        System.out.println("salty");
    }
    public void n2(){
        System.out.println("OMG");
    }
}
public class anonymousInnerClass {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(){
            @Override
            public void n1() {
                System.out.println("spicy");
            }
        };
        Pizza p2 = new Pizza();
        p2.n1();
        p1.n1();
        Pizza p3 = new Pizza(){
            @Override
            public void n1() {
                System.out.println("sweet");
            }
        };
        p3.n1();
        p3.n2();
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
        System.out.println(p3.getClass().getName());
    }
}
