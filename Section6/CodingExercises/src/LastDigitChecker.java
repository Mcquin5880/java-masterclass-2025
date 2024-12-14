public class LastDigitChecker {

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) return false;

        int n1Rightmost = n1 % 10;
        int n2Rightmost = n2 % 10;
        int n3Rightmost = n3 % 10;

        return n1Rightmost == n2Rightmost || n1Rightmost == n3Rightmost || n2Rightmost == n3Rightmost;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
}
