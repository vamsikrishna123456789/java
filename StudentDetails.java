import java.util.Scanner;
public class StudentDetails
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 0;
        int totalPass = 0;
        System.out.print("Enter the total number of students: ");
        int totalNumberOfStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < totalNumberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " details:");
            System.out.print("Enter Register Number: ");
            int registerNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Result (Pass/Fail): ");
            String result = scanner.nextLine();
            System.out.print("Enter Grade: ");
            char grade = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("\nStudent Details:");
            System.out.println("Register Number: " + registerNumber);
            System.out.println("Name: " + name);
            System.out.println("Result: " + result);
            System.out.println("Grade: " + grade);
            if (result.equalsIgnoreCase("Pass")) {
                totalPass++;
            }
            totalStudents++;
            System.out.println("\n-------------------------------");
        }
        double passPercentage = (double) totalPass / totalStudents * 100;
        System.out.println("Total Pass Percentage in Class: " + passPercentage + "%");
        scanner.close();
    }
}
