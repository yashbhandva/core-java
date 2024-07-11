package coreJava;
//by default all method aer super
class A extends classObjects{  //every  class in java extends object class even you cant write
    public A(){
        super();
        System.out.println("in a");
    }
    public A(int x){
        super();
        System.out.println("in a int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in b");
    }
    public B(int y){
        super(y);
        System.out.println("in b int");
    }
}
public class superMethode {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
