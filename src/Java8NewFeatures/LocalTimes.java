package Java8NewFeatures;


import java.time.LocalTime;

public class LocalTimes {
    public static void main(String[] args) {
        LocalTime x = LocalTime.now();
        LocalTime localTime = x.minusHours(1);
        int hour = x.getHour();
        int secondOfDay = x.toSecondOfDay();

        System.out.println(secondOfDay);
        System.out.println(localTime);
        System.out.println(hour);
    }
}
