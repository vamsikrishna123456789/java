import java.util.Scanner;
public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
        scanner.close();
    }
    private static boolean isHarshadNumber(int num) {
        // Calculate the sum of digits
        int sum = 0;
        int originalNumber = num;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return (originalNumber % sum == 0);
    }
}
