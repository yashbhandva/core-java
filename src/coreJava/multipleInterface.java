package coreJava;

interface games{
    void football();
    void cricket();
}
interface MobileGame{
    void freeFire();
    void pubg();
}
interface NewMobileGame extends MobileGame{
    
}
class Man implements games,MobileGame{
    @Override
    public void cricket() {
        System.out.println("lets play cricket");
    }

    @Override
    public void football() {
        System.out.println("lets play football");
    }

    @Override
    public void freeFire() {
        System.out.println("please bor give me DJ alok");
    }

    @Override
    public void pubg() {
        System.out.println("this is worst game ever !!");
    }
}
public class multipleInterface {
    public static void main(String[] args) {
    Man man = new Man();
    man.cricket();
    man.football();
    man.freeFire();
    man.pubg();
    }
}
