package OOP_ClassObjects;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;

    static int studentCount = 0;

    //Constructor
    Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        studentCount++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setGpa(double gpa) {
        if (gpa >= 65 && gpa <= 100) {
            this.gpa = gpa;
        }
    }
    public double getGpa() {
        return gpa;
    }
    public static int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudentCount() {
        return Student.getStudentCount();
    }

    public void Study() {
        System.out.println(name + " is studying");
    }

    public void displayInfo() {
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("StudentId: " + studentId);
        System.out.print("GPA: " + gpa);
        System.out.println();
    }
}
