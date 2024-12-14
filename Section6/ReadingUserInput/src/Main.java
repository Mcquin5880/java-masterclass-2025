import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int currentYear = 2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hey, what's your name? ");
        System.out.println("Hi " + name + ", nice to meet ya");
        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);
        return "You are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", nice to meet ya");
        System.out.println("What year were you born?");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed - try again");
            }
        } while (!validDOB);

        return "You are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;
        if (dob < minYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}
