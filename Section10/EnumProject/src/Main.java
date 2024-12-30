import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        DayOfTheWeek weekday = DayOfTheWeek.TUES;
        System.out.println(weekday);

//        for (int i = 0; i < 10; i++) {
//            weekday = getRandomDay();
//            System.out.printf("Name is %s, ordinal value: %d%n", weekday.name(), weekday.ordinal());
//
//            if (weekday == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday :D");
//            }
//            switchDayOfWeek(weekday);
//        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfTheWeek weekday) {
        int weekdayInt = weekday.ordinal() + 1;
        switch (weekday) {
            case WED -> System.out.println("Wednesday is Day " + weekdayInt);
            case SAT -> System.out.println("Saturday is Day " + weekdayInt);
            default -> System.out.println(weekday.name().charAt(0) +
                    weekday.name().substring(1).toLowerCase() +
                    "day is Day " + weekdayInt);
        }
    }
}
