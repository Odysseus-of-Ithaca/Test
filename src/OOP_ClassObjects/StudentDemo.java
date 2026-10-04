package OOP_ClassObjects;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Sorheya", 18, "UR-0589", 1.50);

        s1.displayInfo();
        s1.Study();

        System.out.println("Total Students: " + Student.getStudentCount());
    }
}
