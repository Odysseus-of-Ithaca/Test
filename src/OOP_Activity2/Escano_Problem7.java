package OOP_Activity2;
import java.util.Scanner;
import static java.lang.Short.MIN_VALUE;

public class Escano_Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short max = Short.MIN_VALUE;
        short secmax = Short.MIN_VALUE;

        System.out.println("Enter Numbers: \n(Enter a negative number to exit) ");

        while (sc.hasNextShort()) {
            short num = sc.nextShort();

            if (num < 0) {
                break;
            }

            if (num > max) {
                secmax = max;
                max = num;
            } else if (num > secmax) {
                secmax = num;
            }
        }

        System.out.println("Second Largest Number: " + secmax);

        sc.close();
    }
}
