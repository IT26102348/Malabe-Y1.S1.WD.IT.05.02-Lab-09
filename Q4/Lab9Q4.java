
public class IT26102348Lab9Q3 {
public class StudentGradeCalculator {

    // a) Method to calculate final mark (30% assignment + 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Method to return the grade obtained for the given final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 65) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else if (finalMark >= 35) {
            return 'S';
        } else {
            return 'F';
        }
    }

    // c) Method to print the Name, Final Mark, and Grade of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("-----------------------------------");
        System.out.println("Name        : " + name);
        System.out.println("Final Mark  : " + finalMark);
        System.out.println("Grade       : " + grade);
        System.out.println("-----------------------------------");
    }

    // d) Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to get details for 5 students
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i + ":");
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left-over

            // Calculate final mark and grade using the methods
            double finalMark = calcFinalMark(assignmentMark, examMark);
            char grade = findGrades(finalMark);

            // Display student details using printDetails method
            printDetails(name, finalMark, grade);
            System.out.println();
        }

        scanner.close();
    }
}