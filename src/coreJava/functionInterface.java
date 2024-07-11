package coreJava;
@FunctionalInterface
interface Xyz{
    void show();
}
public class functionInterface {
    public static void main(String[] args) {
        Xyz y = new Xyz(){
            @Override
            public void show(){
                System.out.println("hello world...");
            }
        };
        y.show();
    }
}
