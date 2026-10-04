package OOP_Activity1;
import java.util.Scanner;

public class Escano_Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        short num = sc.nextShort();
        short arr[] = new short[num];
        short sum = 0;

        System.out.println("Enter number between 1-1000: ");

        for (int i = 0; i < arr.length; i++) {
            short input = sc.nextShort();

            while (input < 0 || input > 1000) {
                System.out.println("Not within range");
                System.out.println("Enter number between 1-1000: ");
                input = sc.nextShort();
            }

            arr[i] = input;
            sum += input;
        }

        System.out.println("Sum of the elements in the array is: " + sum);

        sc.close();
    }
}
