package coreJava;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,4,7,9,4,2,1};
        int size = arr.length;
        int temp;
        for (int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-i-1;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
}
