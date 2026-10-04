package OOP_Activity4;
import java.util.Scanner;
import java.util.ArrayList;

public class Escano_Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Short> nums = new ArrayList<>();

        System.out.println("Enter 4 Numbers: ");
        for (int i = 0; i <= 4; i++) {
            short num = sc.nextShort();
            nums.add(num);
        }

        System.out.println("Current List: " + nums);
        System.out.println("\nEnter Index to Delete (0-3): ");
        short index = sc.nextShort();
        nums.remove(index);

        System.out.println("Updated List: " + nums);
        System.out.println("New size of List: " + nums.size());

        sc.close();
    }
}
