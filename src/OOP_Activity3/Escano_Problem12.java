package OOP_Activity3;
import java.util.Scanner;

public class Escano_Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        boolean flag = false;

        System.out.println("Enter 5 Positive Numbers: ");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            if (isPrime(num[i])) flag = true;
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
        }

        if (flag) {
            System.out.println("Highest Prime Number: " + max);
            System.out.println("Lowest Prime Number: " + min);
        }

        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}