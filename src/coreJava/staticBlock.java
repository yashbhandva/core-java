package coreJava;
//static is come to be class not a object
class Car{
    int price;
   static String name;

    public Car(){
        int price;
        System.out.println("in a constructor");
    }
    static {
        name = "BMW";
        System.out.println("in a static block");
    }
}
public class staticBlock {
    public static void main(String[] args) {
        Car c1 = new Car();
//        c1.price = 999;
//        System.out.println(c1.price);
    }
}
