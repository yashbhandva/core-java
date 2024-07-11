package coreJava;

import java.util.Scanner;
@FunctionalInterface
interface Calc{
    void sum();
}
public class Lamda {
    public static void main(String[] args) {
        Calc calc = ()->{
          Scanner sc = new Scanner(System.in);
          System.out.println("enter first value : ");
          int a = sc.nextInt();
          System.out.println("enter second value : ");
          int b = sc.nextInt();
          int c = a + b;
          System.out.println(c);
        };
        calc.sum();
    }
}
