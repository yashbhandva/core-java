package Java8NewFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
    int roll;
    String name;

    Students(int roll,String name){
        this.name = name;
        this.roll = roll;
    }
    public String toString(){
        return roll+" : "+name;
    }
    //according to alphabetical order
    public int compareTo(Students m1){
        return CharSequence.compare(this.name,m1.name);
    }
//    according to Integers order
//    public int compareTo(Students m1){
//        return Integer.compare(this.roll,m1.roll);
//    }
}

public class LambdaDemo7 {
    public static void main(String[] args) {
        Comparator<Students> st = (Students o1,Students o2) ->{
            return o2.compareTo(o1);
        };
    ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(1,"chintan"));
        list.add(new Students(2,"raj"));
        list.add(new Students(3,"jay"));
        list.add(new Students(4,"yash"));
        list.add(new Students(5,"khushal"));

        System.out.println(list);
        Collections.sort(list,st);
        System.out.println(list);
    }
}
