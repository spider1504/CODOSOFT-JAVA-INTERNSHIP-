import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input: Take marks obtained in each subject
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            int totalMarks = 0;

            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                int marks = scanner.nextInt();
                
                // Ensure marks are within the valid range (0 to 100)
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                    return;
                }

                totalMarks += marks;
            }

            // 1. Calculate Total Marks
            System.out.println("Total Marks: " + totalMarks);

            // 2. Calculate Average Percentage
            double averagePercentage = (double) totalMarks / numSubjects;
            System.out.println("Average Percentage: " + averagePercentage + "%");

            // 3. Grade Calculation
            char grade;

            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // 4. Display Results
            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }
}
