public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            int rightmost = number % 10;
            if (rightmost % 2 == 0) {
                sum += rightmost;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
}
