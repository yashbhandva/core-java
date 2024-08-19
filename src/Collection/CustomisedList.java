package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int roll;
    String name;

    Student(int roll,String name){
        this.name = name;
        this.roll = roll;
    }
    public String toString(){
        return roll+" : "+name;
    }

    public int compareTo(Student m1) {
        return Integer.compare(this.roll,m1.roll);
    }
}
class MyCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Student m1 = o1;
        Student m2 = o2;

        return m2.compareTo(m1);
    }
}
public class CustomisedList {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(1,"chintan"));
        st.add(new Student(2,"raj"));
        st.add(new Student(3,"jay"));
        st.add(new Student(4,"yash"));
        st.add(new Student(5,"khushal"));

        System.out.println(st);
        Collections.sort(st,new MyCompare());
        System.out.println(st);
    }
}
