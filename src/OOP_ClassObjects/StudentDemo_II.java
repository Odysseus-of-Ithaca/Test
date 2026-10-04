package OOP_ClassObjects;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentDemo_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student_II> students = new ArrayList<Student_II>();

        while (true) {
            System.out.print("Would you like to record? (yes/no): ");
            String ans = sc.next();

            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Enter: NAME || AGE || STUDENT ID || GPA");
                String name = sc.next();
                int age = sc.nextInt();
                String ID = sc.next();
                double gpa = sc.nextDouble();
                students.add(new Student_II(name, age, ID, gpa));
            } else  if (ans.equalsIgnoreCase("no")) {
                for (Student_II s : students) {
                    System.out.println(s.getName() + " | " + s.getAge() + " | " + s.getStudentID() + " | "
                    + s.getGpa());
                }
                System.out.println("Student Count: " + Student_II.getStudentCount());
                break;
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
        sc.close();
    }
}
