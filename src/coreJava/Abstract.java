package coreJava;
abstract class Phone{
    public abstract void call();
    public abstract void playGames();
}
class mi extends Phone{
    @Override
    public void call() {
        System.out.println("calling...");
    }

    @Override
    public void playGames() {
        System.out.println("lets start free fire...");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Phone model1 = new mi();
        model1.call();
        model1.playGames();
    }
}
