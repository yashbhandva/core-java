package Java8NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
    String name;
    int roll;
    int marks;

    Student(String name, int roll,int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return roll + ":" + name;
    }
}

public class PredicateFunctionDemo2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("chintan", 1,93));
        list.add(new Student("raj", 2,23));
        list.add(new Student("jay", 3,18));
        list.add(new Student("yash", 4,105));
        list.add(new Student("khushal", 5,76));

        System.out.println(list);
        Predicate<Student> i = (Student s) -> s.roll > 3;
        for (Student s : list) {
            if (i.test(s)) {
                System.out.println(s.roll + ":" + s.name);
            }
        }
    }
}
