import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isMagicNumber(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }
        scanner.close();
    }
    private static boolean isMagicNumber(int num) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = getSumOfDigits(num);
        }
        return num == 1;
    }
    private static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}