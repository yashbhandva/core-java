package coreJava;
class UchihaItachi{
    public void TOH(int n,String src,String des,String help){
        if (n == 0) {
            return;
        }
        TOH(n-1,src,help,des);
        System.out.println("move "+n+" "+src+" to "+des);
        TOH(n-1,help,des,src);
    }
}
public class towerOfHanoi {
    public static void main(String[] args) {
        UchihaItachi uchihaItachi = new UchihaItachi();
        uchihaItachi.TOH(3,"src","des","help");
    }
}
