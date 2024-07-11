package coreJava;
//C:\Users\Dell\Desktop\xyz
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
    public  int id;
    public  String name;
    public  String password;
    public  String department;
    public  int workExperience;
}

public class Serialization{
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "yash";
        user.password = "532<!@&yudi";
        user.id = 3004;
        user.workExperience = 7;
        user.department = "backEndDeveloper";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dell\\Desktop\\xyz\\Serialization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("all done ");
    }
}
