package Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties p = new Properties();
        FileInputStream fi = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\yash.txt");
        p.load(fi);
        System.out.println(p);

        String s = p.getProperty("Password");
        System.out.println(s);
        p.setProperty("Email","xyz004@gmail.com");

        FileOutputStream fo = new FileOutputStream("C:\\Users\\Dell\\Desktop\\xyz\\yash.txt");
        p.store(fo,"new update...");
        System.out.println(p);
    }
}
