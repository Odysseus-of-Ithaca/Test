package OOP_Escano_MidtermProject;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();

        char choice;
        boolean running = true;

        while (running) {
            System.out.println("=== Inventory Management System ===");
            System.out.println("A. Add New Product");
            System.out.println("B. Remove Product by Code");
            System.out.println("C. Update Product Stock by Code");
            System.out.println("D. Display All Products");
            System.out.println("E. Exit");
            System.out.print("Choose an option: ");

            choice = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            switch (choice) {
                case 'a':
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Code: ");
                    String code = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Stock Quantity: ");
                    int stocks = sc.nextInt();
                    sc.nextLine();

                    Product product = new Product(name, code, price, stocks);
                    inventory.add(product);

                    System.out.println("Product Added Successfully!\n");
                    break;

                case 'b':
                    System.out.print("Enter Product Code to Remove: ");
                    String ID = sc.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).getProductCode().equalsIgnoreCase(ID)) {
                            inventory.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("System Error: Product Code does not exist.");
                    } else {
                        System.out.println("Product Removed Successfully!\n");
                    }
                    break;

               case 'c':
                   System.out.print("Enter Product Code to Update: ");
                   String updateID = sc.nextLine();
                   boolean updated = false;

                   for (Product p : inventory) {
                       if (p.getProductCode().equalsIgnoreCase(updateID)) {
                           System.out.print("Enter New Stock Quantity: ");
                           int newStock = sc.nextInt();
                           sc.nextLine();
                           p.setStockQuantity(newStock);
                           System.out.println("Product Updated Successfully!\n");
                           updated = true;
                           break;
                       }
                   }

                   if (!updated) {
                       System.out.println("System Error: Product Code does not exist.\n");
                   }
                   break;

               case 'd':
                   if (inventory.isEmpty()) {
                       System.out.println("No Products in Inventory.\n");
                   } else {
                       System.out.println("==== INVENTORY LIST ====");
                       for (Product p : inventory) {
                           p.displayProduct();
                       }
                       System.out.println("Total Unique Products Currently in the System: " + inventory.size()
                       + "\n");
                   }
                   break;

               case 'e':
                   System.out.println("Thank you for checking the Inventory System! Goodbye!");
                   running = false;
                   break;

               default:
                   System.out.println("Invalid input. Please try again.");
                   break;
            }
        }
        sc.close();
    }
}
