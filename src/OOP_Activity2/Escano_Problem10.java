package OOP_Activity2;
import java.util.Scanner;

public class Escano_Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short max = Short.MIN_VALUE;
        short min = Short.MAX_VALUE;

        System.out.println("Enter numbers: \n(Enter 'Stop' to exit) ");

        while (sc.hasNextShort()) {
            short count = sc.nextShort();

            if (count > max) {
                max = count;
            }
             if (count < min) {
                 min = count;
             }
        }
        System.out.println("Highest: " + max + "\nLowest: " + min);

        sc.close();
    }
}
