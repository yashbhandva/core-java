package innerClasses;

class outer {
    int x = 10;
    static int y = 20;

    class inner {
        public void y1() {
            System.out.println(x);
            System.out.println(y);
        }
    }
}

public class innerClassDemo2 {
    public static void main(String[] args) {
//        outer o = new outer();
//        outer.inner i = o.new inner();
//        i.y1();
        new outer().new inner().y1();
    }
}
