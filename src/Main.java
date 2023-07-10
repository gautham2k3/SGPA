import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            if (numSubjects <= 0) {
                System.out.println("Invalid number of subjects. Please try again.");
                return;
            }

            double totalCredits = 0;
            double totalGradePoints = 0;

            StringBuilder data = new StringBuilder();
            data.append("Name: ").append(name).append("\n");
            data.append("ID: ").append(id).append("\n\n");

            for (int i = 1; i <= numSubjects; i++) {
                System.out.println("\nSubject " + i + ":");
                System.out.print("Enter the subject credits: ");
                double credits = scanner.nextDouble();
                System.out.print("Enter the subject grade: ");
                String grade = scanner.next().toUpperCase();

                // Validate the grade input
                double gradePoint = getGradePoint(grade);
                if (gradePoint == -1.0) {
                    System.out.println("Invalid grade entered. Please try again.");
                    return;
                }

                // Calculate the grade point and update the totals
                totalCredits += credits;
                totalGradePoints += gradePoint * credits;

                // Append subject data to StringBuilder
                data.append("Subject ").append(i).append(": ").append("Credits: ").append(credits).append(", Grade: ")
                        .append(grade).append("\n");
            }

            // Calculate and display the SGPA
            double sgpa = totalGradePoints / totalCredits;
            System.out.printf("\nYour SGPA (Semester Grade Point Average) is: %.2f\n", sgpa);

            // Append SGPA to StringBuilder
            data.append("\nSGPA: ").append(String.format("%.2f", sgpa));

            // Save data to a file
            saveDataToFile(data.toString(), name);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the data to a file.");
            e.printStackTrace();
        }
    }

    public static double getGradePoint(String grade) {
        return switch (grade) {
            case "A+" -> 10.0;
            case "A" -> 9.0;
            case "B+" -> 8.0;
            case "B" -> 7.0;
            case "C+" -> 6.0;
            case "C" -> 5.0;
            case "D" -> 4.0;
            case "F" -> 0.0;
            default -> -1.0; // indicates invalid grade
        };
    }

    public static void saveDataToFile(String data, String name) throws IOException {
        String fileName = name.replaceAll("\\s+", "_") + "_sgpa_data.txt"; // Replace spaces with underscores in the name
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) {
            printWriter.println(data);
            System.out.println("Data saved to file: " + fileName);
        }
    }
}
