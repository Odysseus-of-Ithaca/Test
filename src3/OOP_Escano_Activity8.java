import java.util.ArrayList;
import java.util.Scanner;

public class OOP_Escano_Activity8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> grades = new  ArrayList<>();

        System.out.println("Enter Numbers: (Type 0 or Neagtive Numbers to terminate)");

        while (true) {
            double nums = sc.nextDouble();
            if (nums <= 0) break;

            grades.add(nums);
        }

        System.out.println("Total grades: " + grades.size());

        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades.get(i));
        }

        if (!grades.isEmpty()) {
            double high = grades.get(0);
            double low = grades.get(0);
            double sum = 0;

            for (double grade : grades) {
                if (grade > high) high = grade;
                if (grade < low) low = grade;
                sum += grade;
            }

            double average = sum / grades.size();

            System.out.println("Highest grade is " + high);
            System.out.println("Lowest grade is " + low);
            System.out.printf("Average grade is " + "%.2f%n", average);
        }

        sc.close();
    }
}
