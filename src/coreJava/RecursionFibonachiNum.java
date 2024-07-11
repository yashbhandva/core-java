package coreJava;

import java.util.Scanner;

class Sum{
    public int Add(int n) {
       if (n==0 || n==1 ){
           return n;
       }
       int p1 = Add(n-1);
       int p2 = Add(n-2);
       return p1+p2;
    }
}
public class RecursionFibonachiNum {
    public static void main(String[] args) {
      Sum sum = new Sum();
        long l = sum.Add(40);
      System.out.println("the fibonacci number is : "+l);
    }
}