package OOP_Activity4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Escano_Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> colors = new ArrayList<>();

        System.out.println("Please Enter Your 3 Favorite Colors: ");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Color " + i + ": ");
            String color = sc.nextLine();
            colors.add(color);
        }

        System.out.println();
        System.out.println("Your Favorite Colors Are: ");
        for (String c : colors) {
            System.out.println(c);
        }

        sc.close();
    }
}
