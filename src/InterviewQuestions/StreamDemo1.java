package InterviewQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public void num(List<Integer> number){
        number.stream().filter(n -> n%2 ==0 ).forEach(System.out::println);
    }
    public static void main(String[] args) {
        StreamDemo1 demo1 = new StreamDemo1();

        demo1.num(List.of(1,2,3,4,5,6,7,8,9,0));
    }
}
