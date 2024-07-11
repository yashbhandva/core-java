package coreJava;

import java.util.Arrays;
import java.util.List;

public class example {
    public static void main(String[] args) {

        int[] arr = {13,4,17,9,5,44};
//        for (int i : arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        Arrays.sort(arr);
//        for (int i : arr){
//            System.out.print(i+" ");
//        }
        List<int[]> list = List.of(arr);
        System.out.println(list);

    }
}
