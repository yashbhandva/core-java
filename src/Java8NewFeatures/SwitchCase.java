package Java8NewFeatures;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "wen";
        String time = switch (day){

            case "set","sun" -> "12pm";

            case "mon" -> "8am";

            default -> "7am";

        };
        System.out.println(time);
    }
}
