package innerClasses;

class outerClass{
    public void y1(){
        class InnerClass{
            public void sum(int a,int b){
                System.out.println("sum of two number is : "+(a+b));
            }
        }
        InnerClass i = new InnerClass();
        i.sum(12,23);
        i.sum(43,85);
        i.sum(31,67);
    }
}
public class MethodLocalInnerClasses {
    public static void main(String[] args) {
        outerClass o = new outerClass();
        o.y1();
    }
}
