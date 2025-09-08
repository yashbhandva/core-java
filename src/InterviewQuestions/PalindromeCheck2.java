package InterviewQuestions;

import java.util.Scanner;

public class PalindromeCheck2 {
    public void isPalindrome(String string){
        int len = string.length()-1;
        String rev = "";

        for (int i = len; i>=0;i--){
            rev = rev+string.charAt(i);
        }
        System.out.println(rev);
        if (rev.equals(string)){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("is not palindrome!");
        }
    }
    public static void main(String[] args) {
        PalindromeCheck2 pd = new PalindromeCheck2();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        pd.isPalindrome(string);
    }
}
