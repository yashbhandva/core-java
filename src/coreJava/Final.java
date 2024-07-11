package coreJava;

final class calc{//can not extend the final class
    final double PI = 3.14; //can not change the value
    public final void show(){//can not implement the methode to other extended class
        System.out.println("hey yash");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
public class Final {
    public static void main(String[] args) {
        calc ck = new calc();
        System.out.println(ck.PI);
        ck.show();
        ck.add(3,2);
    }
}
