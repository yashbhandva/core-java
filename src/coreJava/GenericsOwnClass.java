package coreJava;

class Generics<T>{
    T ob;
    Generics(T ob){
        this.ob = ob;
    }
    public T GetOb(){
        return ob;
    }
}
public class GenericsOwnClass {
    public static void main(String[] args) {
        Generics<Integer> g1 = new Generics<>(70);
        System.out.println(g1.ob.getClass().getName());
        System.out.println(g1.GetOb());

        Generics<String> g2 = new Generics<>("madara");
        System.out.println(g2.ob.getClass().getName());
        System.out.println(g2.GetOb());

        Generics<Double> g3 = new Generics<>(7.09);
        System.out.println(g3.ob.getClass().getName());
        System.out.println(g3.GetOb());
    }
}
