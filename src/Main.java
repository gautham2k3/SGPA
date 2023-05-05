import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Define the valid grade range and associated grade point
        String[] validGrades = {"O", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
        double[] gradePoints = {10, 9, 8, 7, 6, 5, 4, 3, 2, 0};

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for(int i=1; i<=numSubjects; i++){
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter the subject credits: ");
            double credits = scanner.nextDouble();
            System.out.print("Enter the subject grade: ");
            String grade = scanner.next().toUpperCase();

            // Validate the grade input
            int index = -1;
            for(int j=0; j<validGrades.length; j++){
                if(validGrades[j].equals(grade)){
                    index = j;
                    break;
                }
            }
            if(index == -1){
                System.out.println("Invalid grade entered for subject " + i + ". Please try again.");
                i--;
                continue;
            }

            // Calculate the grade point and update the totals
            double gradePoint = gradePoints[index];
            totalCredits += credits;
            totalGradePoints += (gradePoint * credits);
        }

        // Calculate and display the SGPA
        double sgpa = totalGradePoints / totalCredits;
        System.out.printf("\nYour SGPA sem grade point average  is: %.2f\n", sgpa);
    }
}
