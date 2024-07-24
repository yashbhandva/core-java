package ObjectOrientedPrograming;
class P{
    public Number m1(){
        return 5+5;
    }
}
class C extends P{
    public Integer m1(){
        return 2+3;
    }
}
public class CoVarientReturnTypeMethodOverloading {
    public static void main(String[] args) {
        P p = new P();
        Object x = p.m1();
        System.out.println(x);
    }
}
