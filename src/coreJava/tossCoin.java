package coreJava;

class Coin{
    public void Toss(int n,String ans){
        if (n==0){
            System.out.println(ans);
            return;
        }
        Toss(n-1,ans+"A");
        Toss(n-1,ans+"B");
        Toss(n-1,ans+"C");
    }
}
public class tossCoin {
    public static void main(String[] args) {
    Coin cn = new Coin();
    cn.Toss(3,"");
    }
}
