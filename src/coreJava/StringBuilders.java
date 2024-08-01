package coreJava;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Itachi");
        sb.setCharAt(0,'g'); //-->gtachi
        sb.append(10); //--> gtachi10
        sb.insert(1,'i'); // --> gitachi10
        //sb.delete(0,7); -->10
        sb.deleteCharAt(0); //-->itachi10
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
