package InterviewQuestions;

public class ReverseEachWord {
    public void reverse(String s){
        StringBuilder sb = new StringBuilder("");
        String ans = "";

        for (int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);

            if (ch != ' '){
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans = ans+sb;
                ans = ans+" ";
                sb = new StringBuilder();
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        ReverseEachWord rs = new ReverseEachWord();
        rs.reverse("yash");
    }
}
