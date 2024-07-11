package Java8NewFeatures;

interface DemoInterface{
    void existedInterface();
    default  void newDefaultInterface(){
        System.out.println("this is a newDefaultInterface method...");
    }
    default int sum(int a,int b){
        return a+b;
    }
}
class DemoClass implements DemoInterface{
    @Override
    public void existedInterface() {
        System.out.println("this is a existedInterface method...");
    }
}
public class DefaultMethodInterface {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.existedInterface();
        demoClass.newDefaultInterface();
        int c= demoClass.sum(2,4);
        System.out.println(c);
    }
}
