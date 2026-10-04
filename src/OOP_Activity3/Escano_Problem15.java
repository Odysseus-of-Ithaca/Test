package OOP_Activity3;
import java.util.Arrays;
import java.util.Scanner;

public class Escano_Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short[] arr = new short[10];
        short sum = 0;

        System.out.println("Enter 10 numbers: ");
        for (byte i = 0; i < 10; i++) {
            arr[i] = sc.nextShort();
            sum += arr[i];
        }

        double ave = (double) sum/ 10.0;
        System.out.print("Average: " + ave);

        Arrays.sort(arr);

        double min = Math.abs(arr[0] - ave);
        for (byte i = 1; i < 10; i++) {
            double diff = Math.abs(arr[i] - ave);
            if (diff < min) {
                min = diff;
            }
        }

        System.out.print("Closest to the Average: ");
        for (byte i = 0; i < 10; i++) {
            if (Math.abs(arr[i] - ave) == min) {
                if (i > 0 && arr[i] == arr[i - 1]) {
                    continue;
                }
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
