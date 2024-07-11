package Stack;

class Stack{
    private int[] arr = new int[5];
    private int idx = 0;
    public void push(int x){
        try {
            arr[idx] = x;
            idx++;
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("array index out of bounds exception!");
        }
    }
    public int peek(){
        if(idx==0){
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[idx-1];
    }
    public int pop(){
        if (idx==0){
            System.out.println("Stack is empty!");
        }
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }
    public void display(){
        for (int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return idx;
    }
    boolean isEmpty(){
        if (idx==0)return true;
        else return false;
    }
    boolean isFull(){
        if (idx==arr.length) return true;
        else return false;
    }
}
public class implementationWithArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.display();
        st.pop();
        st.display();
        st.peek();
        st.display();
        System.out.println(st.size());

    }
}
