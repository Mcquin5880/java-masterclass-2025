import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] names = {
                "bOb",
                "ALICE",
                "mArY",
                "jOhN",
                "anna",
                "Jane",
                "rOBERT"
        };

        Arrays.asList(names).replaceAll(name -> name.toUpperCase());
        Arrays.asList(names).forEach(name -> System.out.println(name));
        System.out.println();

        Random random = new Random();
        Arrays.asList(names).replaceAll(name -> {
            char midNameInitial = (char) (random.nextInt(26) + 'A');
            return String.format("%s %c.", name, midNameInitial);
        });

        Arrays.asList(names).forEach(name -> System.out.println(name));
        System.out.println();

        Arrays.asList(names).replaceAll(name -> {
            int idx = name.indexOf(" ");
            String firstName = name.substring(0, idx);
            String reversedFirstName = new StringBuilder(firstName).reverse().toString();
            return String.format("%s %s", name, reversedFirstName);
        });

        Arrays.asList(names).forEach(name -> System.out.println(name));
        System.out.println();

        List<String> namesCpy = new ArrayList<>(List.of(names));

        namesCpy.removeIf(name -> name.substring(0, name.indexOf(" ")).equals(
                name.substring(name.lastIndexOf(" ") + 1)));

        System.out.println(namesCpy);
    }
}
