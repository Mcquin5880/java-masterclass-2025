import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class PlainOld {

    private static int last_id = 1;
    private int id;

    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("Creating a PlainOld object with ID: " + id);
    }
}

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Anna", "Bob", "Chuck", "Dave"));
        list.forEach(System.out::println);

        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 2.5, 7.5);

        Supplier<PlainOld> ref1 = PlainOld::new;
        PlainOld newPojo = ref1.get();

        System.out.println("Getting array");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

        calculator((s1, s2) -> s1.concat(s2), "Hello ", "World");
        calculator(String::concat, "Hello ", "World");

        BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
        BinaryOperator<String> b2 = String::concat;

        UnaryOperator<String> u1 = String::toUpperCase;
        String result = "Hello".transform(u1);
        System.out.println(result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = "Hello".transform(f0);
        System.out.println(resultBoolean);
    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}
