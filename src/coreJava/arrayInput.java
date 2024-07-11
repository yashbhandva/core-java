package coreJava;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        //arrayInput array = new arrayInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
