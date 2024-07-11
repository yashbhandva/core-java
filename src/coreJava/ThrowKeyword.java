package coreJava;
class yesException extends Exception{
    public yesException(String string){
        super(string);
    }
}
public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 9/10;
            if (j==0){
                throw new yesException("default output...");
            }
            System.out.println(j);
        }catch (yesException exception){
            System.out.println("can not / by zero!"+exception);
        }
    }
}
