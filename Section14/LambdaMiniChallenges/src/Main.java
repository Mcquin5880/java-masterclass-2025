import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        Consumer<String> printTheParts = sentence -> Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));

        printTheParts.accept("Hello World What's Happenin");

        UnaryOperator<String> everySecondCharFunc = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharFunc.apply("1234567890"));
        System.out.println(everySecondChar(everySecondCharFunc, "1234567890"));

        Supplier<String> iLoveJavaFunc = () -> "I love Java";
        String iLoveJava = iLoveJavaFunc.get();
        System.out.println(iLoveJava);

    }

    public static String everySecondChar(UnaryOperator<String> func, String source) {
        return func.apply(source);
    }
}
