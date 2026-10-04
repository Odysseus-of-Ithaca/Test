package OOP_Activity4;
import java.util.Scanner;

public class Escano_Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers to Reverse: ");
        short input = sc.nextShort();
        int reverse = reverse(input);

        System.out.println("Reversed Numbers: " + reverse);

        sc.close();
    }

    public static int reverse(short number) {
        int result = 0;
        while (number != 0) {
            int temp = number % 10;
            result = (result * 10) + temp;
            number /= 10;
        }
        return result;
    }
}
