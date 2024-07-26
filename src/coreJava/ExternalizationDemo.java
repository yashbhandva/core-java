package coreJava;

import java.io.*;

class Account1 implements Externalizable {
    String userName;
    int id;
    String mail;

    public Account1(){

    }

    public Account1(String userName ,int id ,String mail) {
        this.userName = userName;
        this.id = id;
        this.mail = mail;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(mail);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        mail = (String) in.readObject();
    }
}
public class ExternalizationDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Account1 a1 = new Account1("madara",1004,"madara004@gaml.com");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\Desktop\\xyz\\Externalizable.txt");
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(a1);

        FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\Externalizable.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        Account1 account1= (Account1) oi.readObject();

        System.out.println(account1.userName);
        System.out.println(account1.id);
        System.out.println(account1.mail);
    }
}
