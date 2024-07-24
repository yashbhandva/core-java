package coreJava;

import java.io.*;

class Mail implements Serializable{
    private String id;
    transient private int password;

    Mail(String id,int password){
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }
}
public class TransientKeyWord {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Mail mail = new Mail("xyz@gmail.com",95125);
        FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\Desktop\\xyz\\yas.txt");
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(mail);
        fo.close();
        o.close();

        System.out.println("Serializable process is done.");
        FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\yas.txt");
        ObjectInputStream o1 = new ObjectInputStream(fi);
        Mail mail1 = (Mail) o1.readObject();

        System.out.println("Mail id is : "+mail1.getId());
        System.out.println("password is : "+mail1.getPassword());
    }
}
