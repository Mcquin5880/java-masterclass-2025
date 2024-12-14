public class Main {

    public static void main(String[] args) {
        int i = 0;
        int oddCount = 0;
        int evenCount = 0;

        while (i <= 20) {
            i++;
            if (!isEvenNumber(i)) {
                oddCount++;
                continue;
            }
            System.out.println("Even: " + i);
            evenCount++;

            if (evenCount == 5) break;
        }

        System.out.println("Odd count: " + oddCount + ", even count: " + evenCount);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
