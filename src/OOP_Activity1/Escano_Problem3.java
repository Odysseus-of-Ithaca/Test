package OOP_Activity1;
import java.util.Scanner;

public class Escano_Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are: ");

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        sc.close();
    }
}
