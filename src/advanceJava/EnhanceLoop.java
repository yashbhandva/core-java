package advanceJava;

import java.util.List;

public class EnhanceLoop {
    public static void main(String[] args) {
        printNum(List.of(1,2,3,4,5,6,7,8,9,0));
    }

    public static void printNum(List<Integer> num){
        for (int i : num){
            System.out.println(i);
        }
    }
}
