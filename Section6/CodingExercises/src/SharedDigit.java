import java.util.HashSet;
import java.util.Set;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        Set<Integer> num1Digits = new HashSet<>();
        while (num1 > 0) {
            num1Digits.add(num1 % 10);
            num1 /= 10;
        }

        while (num2 > 0) {
            if (num1Digits.contains(num2 % 10)) {
                return true;
            }
            num2 /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }
}
