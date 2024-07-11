package coreJava;

class Mobile{
   static String brand;
    int price;

    public void show(){
        System.out.println("brand is :"+brand);
        System.out.println("price is :"+price);
    }
}
public class basicMethod {
    public static void main(String[] args) {
        Mobile M1 = new Mobile();
        Mobile.brand = "apple";
        M1.price = 150000;

        Mobile M2 = new Mobile();
        Mobile.brand = "iPhone";
        M2.price = 550000;

        Mobile.brand = "phone";
        M1.show();
        M2.show();
    }
}
