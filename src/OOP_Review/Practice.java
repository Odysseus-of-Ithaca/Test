package OOP_Review;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int highest;
        int lowest;
        double avg = 0;
        int passed = 0;
        int failed = 0;

        String[] students = new String[10];
        int[] grades = new int[10];
        System.out.println("Enter 10 Students: ");

        for (int i = 0; i < students.length; i++) {
            System.out.print("\nStudent " + (i + 1) + ": ");
            students[i] = sc.next();

            System.out.println("Grade: ");
            grades[i] = sc.nextInt();
            sc.nextLine();

            sum += grades[i];
        }
        highest = grades[0];
        lowest = grades[0];

        for (int j = 0; j < grades.length; j++) {
            if (grades[j] > highest) {
                highest = grades[j];
            }
            if (grades[j] < lowest) {
                lowest = grades[j];
            }
            if (grades[j] >= 75) {
                passed++;
            } else if (grades[j] >= 50 && grades[j] < 75) {
                System.out.println("Request Remedial to Admin");
            } else {
                failed++;
            }
            double average = (double) sum / grades.length;

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i] + " = " + grades[i]);
            }

            System.out.println("Average of grades: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
            System.out.println("\nPassed: " + passed);
            System.out.println("Failed: " + failed);

            System.out.println("Passings Student: ");
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] < 75) {
                    System.out.println(grades[i] + " = " + grades[i]);
                }
            }

            sc.close();
        }
    }
}
