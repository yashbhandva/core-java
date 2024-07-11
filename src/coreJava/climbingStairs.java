package coreJava;

class Climbing{
    public void Climb(int curr,int n,String ans){
        if (curr==n){
            System.out.println(ans);
            return;
        }
        if (curr>n){
            return;
        }
        //if (curr+1<=n)
        Climb(curr+1,n,ans+"1");
        //if (curr+2<=n)
        Climb(curr+2,n,ans+"2");
        //if (curr+3<=n)
        Climb(curr+3,n,ans+"3");
        //if (curr+4<=n)
        Climb(curr+4,n,ans+"4");
        //if (curr+5<=n)
        Climb(curr+5,n,ans+"5");
    }
}
public class climbingStairs {
    public static void main(String[] args) {
    Climbing climbing = new Climbing();
    climbing.Climb(0,6,"");
    }
}
