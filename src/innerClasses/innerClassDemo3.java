package innerClasses;

class OuterDemo3 {
    int x = 10;

    class InnerDemo3 {
        int x = 100;

        public void y1() {
            int x = 1000;
            System.out.println(x);
            System.out.println(InnerDemo3.this.x);
            System.out.println(OuterDemo3.this.x);
        }
    }
}

public class innerClassDemo3 {
    public static void main(String[] args) {
        new OuterDemo3().new InnerDemo3().y1();
    }
}
