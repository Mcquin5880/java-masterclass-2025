import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Location> itinerary = new LinkedList<>(List.of(
                new Location("Sydney", 0),
                new Location("Adelaide", 1374),
                new Location("Alice Springs", 2771),
                new Location("Brisbane", 917),
                new Location("Darwin", 3972),
                new Location("Melbourne", 877),
                new Location("Perth", 3923)
        ));

        itinerary.sort(Comparator.comparingInt(Location::distFromSydney));
        ListIterator<Location> li = itinerary.listIterator();
        printMenuOptions();

        while (true) {
            char input = sc.nextLine().toUpperCase().charAt(0);
            if (input == 'Q') break;
            switch (input) {
                case 'F' -> printNextLocation(li);
                case 'B' -> printPreviousLocation(li);
                case 'L' -> itinerary.forEach(System.out::println);
                case 'M' -> printMenuOptions();
            }
        }
    }

    private static void printMenuOptions() {
        String text = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";

        System.out.println(text);
    }

    private static void printNextLocation(ListIterator<Location> li) {
        if (li.hasNext()) {
            System.out.println(li.next());
        } else {
            System.out.println("Itinerary complete");
        }
    }

    private static void printPreviousLocation(ListIterator<Location> li) {
        if (li.hasPrevious()) {
            System.out.println(li.previous());
        } else {
            System.out.println("No previous locations");
        }
    }
}
