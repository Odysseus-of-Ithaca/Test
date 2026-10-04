import java.util.Scanner;
import java.util.ArrayList;

class GradeRecord {
    private String subject;
    private double[] scores;
    private double average;

    public GradeRecord(String subject, double q1, double q2, double q3) {
        this.subject = subject;

        if (q1 >= 0 && q1 <= 100 && q2 >= 0 && q2 <= 100 && q3 >= 0 && q3 <= 100) {
            this.scores = new double[]{q1, q2, q3};
            this.average = (q1 + q2 + q3) / 3.0;
        } else {
            System.out.println("Error: Quiz Scores input/s was Invalid. Scores are automatically 0.");
            this.scores = new double[]{0.0, 0.0, 0.0};
            this.average = 0.0;
        }
    }

    public String getSubject() {
        return subject;
    }

    public double[] getScores() {
        return scores.clone();
    }

    public double getAverage() {
        return average;
    }

    public void displayReport() {
        System.out.printf("%s | Quizzes: [%.1f, %.1f, %.1f] | Average: %.2f%n",
                subject, scores[0], scores[1], scores[2], average);
    }
}

public class GradeRecordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GradeRecord> records = new ArrayList<>();

        while (true) {
            System.out.print("Enter Subject Name (or 'Done' to finish): ");
            String sub = sc.nextLine().trim();

            if (sub.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Quiz 1 Score: ");
            double q1 = sc.nextDouble();
            System.out.print("Enter Quiz 2 Score: ");
            double q2 = sc.nextDouble();
            System.out.print("Enter Quiz 3 Score: ");
            double q3 = sc.nextDouble();
            sc.nextLine();

            if (q1 < 0 || q1 > 100 || q2 < 0 || q2 > 100 || q3 < 0 || q3 > 100) {
                System.out.println("Invalid Scores! All scores must be between 0 and 100. Record not saved.\n");
                continue;
            }

            GradeRecord record = new GradeRecord(sub, q1, q2, q3);
            records.add(record);
            System.out.println("Records saved.\n");
            System.out.println();
        }

        if (records.isEmpty()) {
            System.out.println("No Grade Records found.");
        } else {
            double totalAverage = 0;
            for (GradeRecord record : records) {
                record.displayReport();
                totalAverage += record.getAverage();
            }

            double overallAverage = totalAverage / records.size();
            System.out.printf("%nOverall Average of All Subjects: %.2f%n", overallAverage);
            System.out.println("Total Subjects Recorded: " + records.size());
        }

        sc.close();
    }
}
