package OOP_UML;

import java.util.Scanner;

public class StudentManager {
    static Student_III[] students;
    static byte studentMax = 3;
    static int studentCount = 0;

    public static void main(String[] args) {
        students = new Student_III[studentMax];
        Scanner sc = new Scanner(System.in);
        char choice = 0;
        boolean toLoop = true;

        while (toLoop) {
            displayMenu();
            System.out.print("Choose an option: ");
            choice = sc.next().toLowerCase().charAt(0);
            System.out.println();
            switch (choice) {
                case 'a':
                    addStudent(sc);
                    System.out.println();
                    break;

                case 'b':
                    removeStudent(sc);
                    System.out.println();
                    break;

                case 'c':
                    displayStudents();
                    System.out.println();
                    break;
                case 'd':
                    System.out.println("Good Bye!");
                    toLoop = false;
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.println();
            }
        }
    }

    static void displayMenu() {
        System.out.println("==== Student Management System ====");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");
        System.out.println();
    }

    public static void addStudent(Scanner sc) {
        if (studentCount >= studentMax) {
            System.out.println("Student List is full.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String ans1 = sc.next();
        System.out.print("Enter Student Age: ");
        int ans2 = sc.nextInt();
        System.out.print("Enter Student ID: ");
        String ans3 = sc.next();
        System.out.print("Enter Student GPA: ");
        double ans4 = sc.nextDouble();
        System.out.println();

        students[studentCount] = new Student_III(ans1, ans2, ans3, ans4);
        studentCount++;

        System.out.println("Student has been added Successfully!");
    }

    public static void removeStudent(Scanner sc) {
        if (studentCount == 0) {
            System.out.println("No Students Found.");
            return;
        }

        System.out.print("Enter Student ID to remove: ");
        String ID = sc.next();
        System.out.println();
        for (int i =0; i < studentCount; i++) {
            if (students[i].getStudentID().equals(ID)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;

                System.out.println("Student has been removed Successfully!");
                return;
            }
        }
        System.out.println("Student ID Not Found!");
    }

    public static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No Students Found.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nStudent " + (i + 1));
            students[i].displayInfo();
        }
    }
}