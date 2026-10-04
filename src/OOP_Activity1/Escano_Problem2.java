package OOP_Activity1;
import java.util.Scanner;

public class Escano_Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Williamsburg Women's Club Scholarship Application");
        System.out.println();
        System.out.println("Enter Highschool GPA: ");
        float GPA = sc.nextFloat();
        System.out.println("Enter Number of Extra Curricular Activities Done: ");
        byte Curri = sc.nextByte();
        System.out.println("Enter Number of Service Activities Done: ");
        byte ServiceAct = sc.nextByte();

        if (GPA >= 3.8 && Curri >= 1 && ServiceAct >= 1) {
            System.out.println("Scholarship Candidate");
        } else if (GPA >= 3.4 && GPA < 3.8 && Curri >= 3 && ServiceAct >= 3) {
            System.out.println("Scholarship Candidate");
        } else if (GPA >= 3.0 && GPA < 3.4 && Curri >= 2 && ServiceAct >= 3) {
            System.out.println("Scholarship Candidate");
        } else {
            System.out.println("Not a Candidate");
        }

        sc.close();
    }
}
