package coreJava;

class Mage{
    public void mage(int cr,int cc,int er,int ec,String ans){
        if (cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if (cr>er || cc>ec){
            return;
        }
        mage(cr+1,cc,er,ec,ans+"H");
        mage(cr,cc+1,er,ec,ans+"V");
    }
}
public class MageWithRecursion {
    public static void main(String[] args) {
        Mage m = new Mage();
        m.mage(0,0,2,2,"");
    }
}
