package Collection;
import java.util.WeakHashMap;

class temp{
    @Override
    public String toString() {
        return "temp{}";
    }
    public void finalized(){
        System.out.println("finalized method called");
    }
}
public class WeakHashMaps {
    public static void main(String[] args) throws InterruptedException {
        temp t = new temp();
        WeakHashMap<temp,String > sm = new WeakHashMap<>();
        sm.put(t,"yash");
        System.out.println(sm);
        t = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(sm);
    }
}
