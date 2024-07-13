package Collection;

import java.util.Hashtable;

class add{
    int i;
    add(int i){
        this.i = i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i+" ";
    }
}
public class HashTable {
    public static void main(String[] args) {
        Hashtable<add,String> h = new Hashtable<>();
        h.put(new add(5),"A");
        h.put(new add(2),"B");
        h.put(new add(6),"C");
        h.put(new add(15),"D");
        h.put(new add(23),"E");
        h.put(new add(16),"F");

        System.out.println(h);
    }
}
