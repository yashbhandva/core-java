package coreJava;

import java.util.Scanner;
public class emi {
    public static void main(String[] args) {
        float emi,iamt,pamt,rem,i,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter loan amount :");
        float p = sc.nextFloat();
        System.out.print("enter rio :");
        r = sc.nextFloat();
        System.out.print("emter year :");
        float n = sc.nextFloat();
        emi=(float) ((p*(r/1200)*Math.pow(1+(r/1200),(n*12)))/(Math.pow(1+(r/1200),(n*12))-1));
        System.out.println(emi);

        for (i=1;i<=n*12;i++){
            iamt=p*(r/1200);
            pamt=emi-iamt;
            rem=p-pamt;
            p=rem;
            System.out.println(i+" "+pamt+" "+iamt+" "+rem+" "+emi);
        }
    }
}