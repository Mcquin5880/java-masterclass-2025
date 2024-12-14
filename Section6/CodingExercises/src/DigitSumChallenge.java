public class DigitSumChallenge {

    public static int sumDigits(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            int rightMostDigit = num % 10;
            sum += rightMostDigit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(5));
    }
}
