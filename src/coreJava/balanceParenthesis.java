package coreJava;

class bp{
    public void validParenthesis(int n,int open,int close,String ans){
        if (open==n && close==n){
            System.out.println(ans);
            return;
        }
        if (open>n || close>open){
            return;
        }
        validParenthesis(n,open+1,close,ans+'(');
        validParenthesis(n,open,close+1,ans+')');
    }
}
public class balanceParenthesis {
    public static void main(String[] args) {
        bp b = new bp();
        b.validParenthesis(3,0,0,"");
    }
}
