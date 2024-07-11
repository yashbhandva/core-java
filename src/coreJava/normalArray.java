package coreJava;

public class normalArray {
    public static void main(String[] args) {
        char ch[] = new char[10];
        ch[0] = ' ';
        ch[1] = '@';
        ch[2] = '#';
        ch[3] = '$';

        for (int i=0;i< ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}
