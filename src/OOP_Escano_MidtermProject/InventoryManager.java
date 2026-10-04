package OOP_Escano_MidtermProject;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        char choice = 0;

        while (true) {
            displayMenu();
            System.out.print("Choose an option: \n");
            choice = sc.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':

            }
        }
    }

    static void displayMenu() {
        System.out.println("=== Inventory Management System ===");
        System.out.println("A. Add New Product");
        System.out.println("B. Remove Product by Code");
        System.out.println("C. Update Product Stock by Code");
        System.out.println("D. Display All Products");
        System.out.println("E. Exit");
    }

    static void addNewProduct(Scanner sc) {

    }
}
