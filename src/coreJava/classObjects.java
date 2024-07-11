package coreJava;
class Student{
    String name;
    int roll;
    int marks;

    public String toString(){
        return String.valueOf(name+" : "+roll+" : "+marks);
    }
}
public class classObjects {
    public static void main(String[] args) {
        System.out.println();
        Student s1 = new Student();
        s1.name = "yash";
        s1.roll = 1;
        s1.marks = 89;

        Student s2 = new Student();
        s2.name = "ram";
        s2.roll = 2;
        s2.marks = 99;

        Student s3 = new Student();
        s3.name = "chagan";
        s3.roll = 3;
        s3.marks = 86;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
//        for (int i=0;i<student.length;i++){
//            System.out.println(student[i].name+" : "+student[i].roll+" : "+student[i].marks);
//        }
        System.out.println();
        for (Student st : student){
            System.out.println(st);
        }
    }
}
