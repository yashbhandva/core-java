package coreJava;

public class displayChar {
    public static void displayC(char ch){
        for (int i=65;i<=90;i++){
            System.out.print((char) i+" ");
        }
    }
    public static void main(String[] args) {
        displayChar dp = new displayChar();
        displayC('a');
    }
}
