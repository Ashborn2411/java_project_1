import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        System.out.println("Enter integer grades in the range 0-100.");
        System.out.println("Type the end-of-file indicator to terminate input:");
        System.out.println("On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter");
        System.out.println("On Windows type <Ctrl> z then press Enter");

        while (input.hasNextInt()) {
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;

            switch (grade / 10) {
                case 9:
                case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;
            }
        }

        System.out.println("\nGrade Report:");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("\nNumber of students who received each grade:\nA: %d\nB: %d\nC: %d\nD: %d\nF: %d%n",
                    aCount, bCount, cCount, dCount, fCount);
        } else {
            System.out.println("No grades were entered.");
        }

        input.close();
    }
}