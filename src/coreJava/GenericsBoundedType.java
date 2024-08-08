package coreJava;

class Bound<T extends Number>{
    T i;
    int n;
    String s;

    Bound(T i,int n,String s){
        this.i = i;
        this.n = n;
        this.s = s;
    }

    public int getN() {
        return n;
    }

    public T getI() {
        return i;
    }

    public String getS() {
        return s;
    }
}
public class GenericsBoundedType {
    public static void main(String[] args) {
        Bound<Integer> i =new Bound<>(2,3,"43");
        System.out.println(i.getI()+" "+ i.getS()+" "+i.getN());
    }
}
