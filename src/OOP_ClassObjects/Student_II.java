package OOP_ClassObjects;

public class Student_II {
    private String name;
    private int age;
    private String studentID;
    private double gpa;

    static int studentCount = 0;

    Student_II(String name, int age, String studentID, double gpa) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gpa = gpa;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 65 && gpa <= 100) {
            this.gpa = gpa;
        }
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudentCount() {
        return Student_II.getStudentCount();
    }

    public void Study() {
        System.out.println(name + " is studying.");
    }

    public void displayInfo() {
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Student ID: " + studentID);
        System.out.print("GPA: " + gpa);
    }
}
