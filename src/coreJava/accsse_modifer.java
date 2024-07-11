package coreJava;

import access_package.defualt;
class Private{
   final String name = "yash";
    private int phoneNumber;
    private String address;

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println(phoneNumber);
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println(address);
    }
}
public class accsse_modifer {
    public static void main(String[] args) {
        Private pt = new Private();
        defualt dt = new defualt();
        pt.setPhoneNumber(951257068);
        pt.setAddress("ahemdabad");
        System.out.println(pt.name);
        System.out.println(dt.getAge());
    }
}
