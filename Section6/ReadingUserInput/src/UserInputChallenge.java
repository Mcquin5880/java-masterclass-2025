import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (n <= 5) {
            System.out.println("Enter number #" + n + ": ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                sum += input;
                n++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("Total: " + sum);
    }
}
