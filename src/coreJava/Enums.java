package coreJava;

import java.util.Arrays;

enum Day{
     SUNDAY,MONDAY,TUSDAY,WENSDAY,THUSDAY,FRIEDAY,SETURDAY;
}
public class Enums {
    public static void main(String[] args) {
        Day[] day = Day.values();
        for (Day d:day){
            System.out.println(d+" : "+ d.ordinal());
        }
    }
}
