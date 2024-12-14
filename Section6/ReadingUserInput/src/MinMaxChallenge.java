import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter a number (or any character to quit): ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                max = Math.max(input, max);
                min = Math.min(input, min);
            } catch (Exception e) {
                break;
            }

            System.out.println("Current max: " + max + ", current min: " + min);
        }
    }
}
