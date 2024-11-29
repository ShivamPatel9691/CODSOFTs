import java.util.*;
import java.util.Scanner;
public class GradeCalculator {
    
    // Method to calculate total marks, average percentage, and grade
    public static void calculateResults(int[] marks) {
        //  Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        //  Calculate average percentage
        double averagePercentage = (double) totalMarks / marks.length;
        
        //  Grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C+";
        } else if (averagePercentage >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }
        
        //  Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Create an array to store marks
        int[] marks = new int[numSubjects];

        // Ask for marks in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Call the method to calculate and display results
        calculateResults(marks);
        scanner.close();
    }
}
