package Java8NewFeatures;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        Supplier<Date> s =Date::new;
        System.out.println(s.get());
    }
}
