package coreJava;

class DivideConquer{
    public void divide(int[] arr,int si,int ei){
        if (si==ei){
            System.out.println(si+ei);
            return;
        }
        int mid = (si+ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
    }
}
public class mergeShort {
    public static void main(String[] args) {
    int[] arr = {4,6,3,76,8,19,9};
    DivideConquer dc = new DivideConquer();

    }
}
