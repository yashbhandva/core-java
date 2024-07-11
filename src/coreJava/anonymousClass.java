package coreJava;
abstract class Abc{
    public abstract void show();
    public abstract void non();
}
public class anonymousClass {
    public static void main(String[] args) {
        Abc aa = new Abc(){
            @Override
            public void show() {
                System.out.println("hey...");
            }

            @Override
            public void non() {
                System.out.println("!");
            }
        };
        aa.show();
        aa.non();
    }
}
