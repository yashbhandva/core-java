package Queues;

class queueArray{
    int f = -1;
    int r = -1;
    int size = 0;
    int[] arr = new int[5];
    public void add(int data){
        if (f == -1) {
            f=r=0;
            arr[0] = data;
            size = 1;
        }
        else {
            try {
                arr[r + 1] = data;
                r++;
                size++;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
    }
    public int remove(){
        if (size==0){
            System.out.println("queue is empty!");
            return -1;
        }
        int x = arr[f];
        f++;
        size--;
        return x;
    }
    public int peek(){
        if (size==0){
            System.out.println("array is empty! ");
            return -1;
        }
        return arr[f];
    }
    public boolean isEmpty(){
        if (size==0)return true;
        else return false;
    }
    public void display(){
        if (size==0){
            System.out.println("queue is empty!");
        }
        else {
            for (int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class implementationWithArray {
    public static void main(String[] args) {
    queueArray q = new queueArray();
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);

    q.display();
    System.out.println(q.size);
    }
}
