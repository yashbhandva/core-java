package Java8NewFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface3 {
    public static void main(String[] args) {
        Predicate<Student> s1 = (Student student) -> student.marks > 33 && student.marks <= 100;
        Function<Student, String> f = (Student s) -> {
            int marks = s.marks;
            String grade = "";

            if (marks > 0 && marks <= 33) {
                grade = "failed";
            } else if (marks > 33 && marks <= 100) {
                grade = "pass";
            } else {
                System.out.print("you are not a student you are a god !!");
            }
            return grade;
        };
        Student[] s = {
                new Student("chintan", 1, 93),
                new Student("raj", 2, 23),
                new Student("jay", 3, 18),
                new Student("yash", 4, 105),
                new Student("khushal", 5, 76)
        };
        for (Student student : s) {
            if (s1.test(student)) {
                System.out.println(student.name + " : " + student.roll + " : " + f.apply(student));
            }
        }
    }
}
