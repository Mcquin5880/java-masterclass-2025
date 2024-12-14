public class DigitSumChallenge {

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int leftmostDigit = num % 10;
            sum += leftmostDigit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(5));
    }
}
