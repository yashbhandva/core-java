package coreJava;

class fact{
    public int factorial(int n){
        if (n==1){
           return 1;
        }
        return n*factorial(n-1);
    }
}
public class Factorial {
    public static void main(String[] args) {
        fact FF = new fact();
        int ff = FF.factorial(4);
        System.out.println(ff);
    }
}
