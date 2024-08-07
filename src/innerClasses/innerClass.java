package innerClasses;

class Home{
    int people;
    public void rules(){
        System.out.println("do not make a voice when mom is sleeping..");
    }
    static class childhoodHome{
        public void SetUp(){
            System.out.println("in my room.... ");
        }
    }
    public String toString(){
        return String.valueOf(people);
    }
}
public class innerClass {
    public static void main(String[] args) {
        Home h1 = new Home();
        Home.childhoodHome home = new Home.childhoodHome();
        h1.people = 5;
        System.out.println(h1);
        h1.rules();
        home.SetUp();
    }
}
