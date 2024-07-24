package coreJava;

import java.io.*;

class Mail1 implements Serializable {
    private String id;
    private int pass;

     Mail1(String id,int pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public int getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "id is : "+getId()+" : "+
                "password is  :"+getPass();
    }
}
class Mail2 extends Mail1{
     Mail2(String id, int pass) {
        super(id, pass);
    }
}
class Mail3 extends Mail1{
     Mail3(String id, int pass) {
        super(id, pass);
    }
}
public class MultiObjectSerialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Mail1 m1 = new Mail1("abc@gmail.com",10012002);
        Mail2 m2 = new Mail2("pqr@gmail.com",30034004);
        Mail3 m3 = new Mail3("xyz@gmail.com",50056006);

        FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\Desktop\\xyz\\yas.txt");
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(m1);
        o.writeObject(m2);
        o.writeObject(m3);

        fo.close();
        o.close();
        System.out.println("all done.");

        FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\yas.txt");
        ObjectInputStream o1 = new ObjectInputStream(fi);
        Mail1 mail1 = (Mail1) o1.readObject();
        Mail2 mail2 = (Mail2) o1.readObject();
        Mail3 mail3 = (Mail3) o1.readObject();

        System.out.println(mail1);
        System.out.println(mail2);
        System.out.println(mail3);
    }
}
