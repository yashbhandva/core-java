package coreJava;

class Subjects{
    String java;
    String cpp;
    String c;
    String html;

    Subjects(String java,String cpp,String c,String html){
        this.java = java;
        this.cpp = cpp;
        this.c = c;
        this.html = html;
    }
    Subjects(String java,String cpp,String c){
        this.java = java;
        this.cpp = cpp;
        this.c = c;
    }
    Subjects(String java,String cpp){
        this.java = java;
        this.cpp = cpp;
    }
    Subjects(String java){
        this.java = java;
    }
    Subjects(){

    }

    @Override
    public String toString() {
        return "Subjects{" +
                "java='" + java + '\'' +
                ", cpp='" + cpp + '\'' +
                ", c='" + c + '\'' +
                ", html='" + html + '\'' +
                '}';
    }
}
public class OverLoadedConstructor {
    public static void main(String[] args) {
        Subjects subjects = new Subjects("java","cpp");
        System.out.println(subjects);
    }
}
