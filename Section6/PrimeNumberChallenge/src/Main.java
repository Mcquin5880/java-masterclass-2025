public class Main {

    public static void main(String[] args) {
        primeNumberCounter(7, 1000);
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) return false;
        }
        return true;
    }

    public static void primeNumberCounter(int start, int end) {
        if (start < 0 || end > 1000) {
            System.out.println("Invalid range");
            return;
        }

        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
                primeCount++;
            }
            if (primeCount == 3) {
                System.out.println("3 primes found, breaking...");
                break;
            }
        }
    }
}
