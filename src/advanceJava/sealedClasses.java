package advanceJava;


sealed class A permits B,C,D{

}
non-sealed class B extends A{

}
final class C extends A{

}
sealed class D extends A permits E{

}
final class E extends D{

}
class F extends B{
    public void show(){
        System.out.println("hello...");
    }
}

public class sealedClasses {
    public static void main(String[] args) {
        F a = new F();
        a.show();
    }
}
