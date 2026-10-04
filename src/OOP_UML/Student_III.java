package OOP_UML;

public class Student_III {
    private String name;
    private int age;
    private String studentID;
    private double gpa;
    private static int studentCount = 0;

    public Student_III(String name, int age, String studentID, double gpa) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gpa = gpa;
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
        this.age = age;
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
        this.gpa = gpa;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + gpa);
    }

    public static int getTotalStudent() {
        return studentCount;
    }
}
