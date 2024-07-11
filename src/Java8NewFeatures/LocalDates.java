package Java8NewFeatures;

import java.time.*;
import java.time.chrono.IsoEra;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate x = LocalDate.now();
        System.out.println(x);
        LocalDate localDate = LocalDate.of(2005, 12, 8);
        System.out.println(localDate);
        Month month = x.getMonth();
        DayOfWeek dayOfWeek = x.getDayOfWeek();
        int dayOfYear = x.getDayOfYear();
        IsoEra era = x.getEra();
        LocalDate minusDays = x.minusDays(7);
        LocalDate minusMonths = x.minusMonths(12);
        LocalDate minusWeeks = x.minusWeeks(60);
        LocalDate minusYears = x.minusYears(1);
        ZoneId zoneId = ZoneId.of("America/New_York");
        LocalDateTime localDateTime = x.atStartOfDay(zoneId).toLocalDateTime();
        System.out.println("month : "+month);
        System.out.println("day of week : "+dayOfWeek);
        System.out.println("day of year : "+dayOfYear);
        System.out.println("era is : "+era);
        System.out.println(localDateTime);
        System.out.println(zoneId);
        System.out.println(minusDays);
        System.out.println(minusWeeks);
        System.out.println(minusMonths);
        System.out.println(minusYears);
    }
}
