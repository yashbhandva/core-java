package coreJava;

class you{
    public void show()throws ClassNotFoundException{
        Class.forName("throwsKeyword");
    }
    static {
        System.out.println("het");
    }
}
public class throwsKeyword {
    public static void main(String[] args) {
          you u = new you();
        try {
         u.show();
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException...");
        }
    }
}
