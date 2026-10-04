package OOP_Activity4;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Escano_Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> fruitBasket = new HashSet<>();
        System.out.println("Enter 5 Fruits: ");
        for (int i = 0; i < 5; i++){
            String fruit = sc.nextLine();
            fruitBasket.add(fruit);
        }
        System.out.println();
        System.out.println("Your Fruit Basket Contains: ");
        System.out.println(fruitBasket);

        sc.close();
    }
}
