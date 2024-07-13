package Collection;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        Integer[] a = {10,2,4,2,5,9,1};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,7));
    }
}
