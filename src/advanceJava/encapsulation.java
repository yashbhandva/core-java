package advanceJava;

class Alien{
    private final int id;
    private final String name;

    public Alien(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return String.valueOf(name+" : "+id);
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Alien a1 = new Alien(3004,"yash");
        System.out.println(a1);
    }
}
