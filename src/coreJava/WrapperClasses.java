package coreJava;

public class WrapperClasses {
    public static void main(String[] args) {
       Integer i1 = new Integer(10);
       Integer i2 = new Integer("20");
       Integer i3 = new Integer("ten");
        System.out.println(i1);
        System.out.println(i2+" : "+i3);
    }
}
