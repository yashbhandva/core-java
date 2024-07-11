package coreJava;

import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.print("valye 1 :");
        a = sc.nextInt();
        System.out.print("value 2 :");
        b = sc.nextInt();
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.pow(a,b));
        System.out.print("square root :");
        float p = sc.nextFloat();
        System.out.println(Math.sqrt(p));
    }
}
