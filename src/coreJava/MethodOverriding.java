package coreJava;

class Pizza{
    public void test(){
        System.out.println("spicy");
    }
}
class Burger extends Pizza{
    @Override
    public void test() {
        System.out.println("double spicy");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Pizza p = new Burger();
        p.test();
    }
}
