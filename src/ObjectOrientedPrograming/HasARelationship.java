package ObjectOrientedPrograming;

class Parents{
    public void show(){
        System.out.println("My name is...");
    }
    public void show1(){
        System.out.println("how are you... ");
    }
    public void show2(){
        System.out.println("i am your parent...");
    }
}

public class HasARelationship {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.show();
        parents.show2();
    }
}