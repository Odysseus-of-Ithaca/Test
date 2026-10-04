package OOP_Activity2;
import java.util.LinkedHashSet;
import  java.util.Scanner;

public class Escano_Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Short> num = new LinkedHashSet<>();

        while(true){
            System.out.print("Enter number: ");
            short nums = sc.nextShort();

            if (nums == 0) {
                break;
            }

            num.add(nums);
        }

        System.out.println("Distinct Numbers: ");

        for (short nums : num) {
            System.out.print(nums + ", ");
        }

        sc.close();
    }
}
