package InterviewQuestions;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter string value : ");
            String s = sc.next();

            String rev = "";

            int len = s.length() - 1;

            for (int i = len; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            System.out.println(rev);

            if (rev.equals(s)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
            System.out.println("do you want to perform another operation (yes/no)");
            String exite = sc.next();

            if (exite.equalsIgnoreCase("no") || exite.equalsIgnoreCase("n")){
                System.out.println("exiting...");
                break;
            }
        }
    }
}
