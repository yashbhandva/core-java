package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        while (true){
            System.out.print("Enter any number : ");
            int x = sc.nextInt();
            num.add(x);

            System.out.print("do you want to enter one more number ?(y/n)");
            String s = sc.next();
            if (s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n")){
                System.out.println("Exiting...");
                break;
            }
        }
        for (int n: num){
            if (n%2 == 0){
                System.out.println(n);
            }
        }
    }
}
