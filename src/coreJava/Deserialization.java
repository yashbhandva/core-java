package coreJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\Serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user = (User) objectInputStream.readObject();
        System.out.println(user.name);
        System.out.println(user.id);
        System.out.println(user.password);
        System.out.println(user.workExperience);
        System.out.println(user.department);
    }
}
