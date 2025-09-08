package advanceJava;

class Student{
    int id;
    String name;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "student id "+id+" student name "+name;
    }
}
public class EnhanceLoop2 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"yash");
        Student s2 = new Student(2,"ram");
        Student s3 = new Student(3,"chagan");
        Student s4 = new Student(4,"sachin");
        Student s5 = new Student(5,"virat");
        Student s6 = new Student(6,"rohit");
        Student s8 = new Student(8,"kohli");
        Student s9 = new Student(9,"dhoni");
        Student s10 = new Student(10,"rohit");

        Student[] student =  {s1,s2,s3,s4,s5,s6,s8,s9,s10};

        for (Student students : student){
            System.out.println(students);
        }
    }
}
