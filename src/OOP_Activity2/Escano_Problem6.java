package OOP_Activity2;
import java.util.Scanner;

public class Escano_Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 Integers: ");
        short[] arr = new short[10];
        short sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextShort();
            sum += arr[i];
        }

        double average = (double) sum / 10;
        System.out.println("Average: " + average);

        System.out.println("\nNumbers greater than average: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
