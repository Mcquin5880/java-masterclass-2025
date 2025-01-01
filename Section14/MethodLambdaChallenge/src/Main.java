import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private record Person(String first) {

        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }

    public static void main(String[] args) {

        String[] names = {
                "bOb",
                "ALICE",
                "mArY",
                "jOhN",
                "AnNa",
                "rOBERT"
        };

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> funcs = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s + (" " + getRandomChar('D', 'M') + "."),
                s -> s + " " + reverse(s, 0, s.indexOf(" ")),
                tim::last
        ));

        applyChanges(names, funcs);
    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions) {
        List<String> backedByArr = Arrays.asList(names);
        for (var func : stringFunctions) {
            backedByArr.replaceAll(s -> s.transform(func));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt(startChar, (int) endChar + 1);
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }

    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
}
