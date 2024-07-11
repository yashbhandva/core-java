package coreJava;

class Demon{
    public void number(int n){
        if (n==1){ //base case
            System.out.println(n);
            return;
        }
        number(n-1);//smaller problem
        System.out.println(n);//self work
    }
}
public class RecursionPrintNthNumber {
    public static void main(String[] args) {
      Demon demo = new Demon();
        demo.number(7);
    }
}
