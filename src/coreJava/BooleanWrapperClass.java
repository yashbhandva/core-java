package coreJava;

public class BooleanWrapperClass {
    public static void main(String[] args) {
        Boolean b = new Boolean("yes");
        Boolean b1 = new Boolean("no");
        // System.out.println(b.equals(b1)); --> true

        Boolean a = new Boolean("left");
        Boolean a1 = new Boolean("right");
        System.out.println(a.equals(a1));
    }
}
