package Stack;

import java.util.Scanner;
import java.util.Stack;

public class userInpute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("ente the numbe of elements : ");
        int n = sc.nextInt();
        System.out.print("ente elements : ");
        for (int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
