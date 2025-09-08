package InterviewQuestions;

import java.util.Scanner;

public class Toggle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string value here : ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.println(sb);

        for (int i = 0; i <=sb.length()-1; i++) {
            boolean flag = true; //capital 65

            char ch = sb.charAt(i);
            int ass = (char)ch;

            if (ch == ' ') continue;

            if (ass >= 97) { //97 small
                flag = false;
            }

            if (flag == true){
                ass+=32;
                char dh = (char) ass;
                sb.setCharAt(i,dh);
            }
            else {
                ass += -32;
                char dh = (char) ass;
                sb.setCharAt(i, dh);
            }
            System.out.println(sb);
        }

    }
}
