package coreJava;
// C:\Users\Dell\Desktop\xyz

import java.io.*;

class Account implements Serializable {
    private String userName;
    private transient String password;


    @Serial
    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        String newPassword = "1234" + password;
        os.writeObject(newPassword);
    }

    @Serial
    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String newPassword = (String) is.readObject();
        password = newPassword.substring(4);
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return
                "userName = " + getUserName() + '\'' +
                "password =" + getPassword() + '\'';
    }

}

public class CustomizedSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account ac = new Account("yashBhandva", "madara004");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\Desktop\\xyz\\s1.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(ac);
        fo.close();
        os.close();
        System.out.println("all done.");

        FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\s1.txt");
        ObjectInputStream is = new ObjectInputStream(fi);
        Account account = (Account) is.readObject();
        fi.close();
        is.close();

        System.out.println(account);
    }
}
