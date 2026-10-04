package OOP_ClassObjects;
import java.util.Scanner;

public class BicycleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bicycle[] bikes = new Bicycle[3];
        for (byte i = 0; i < bikes.length; i++) {
            bikes[i] = new Bicycle();
        }

        for (byte i = 0; i < bikes.length; i++) {
            System.out.println("< Bike Number: " + (i + 1) + " >");
            System.out.print("Enter Owner's Name: ");
            bikes[i].setOwner(sc.nextLine());
            System.out.print("Enter Bike Speed: ");
            bikes[i].setSpeed(sc.nextShort());
            sc.nextLine();
            System.out.println();

        }

        System.out.println("\n< Bicycle Information >");
        for (byte i = 0; i < bikes.length; i++) {
            System.out.println("< Bike Number: " + (i + 1) + " >");
            bikes[i].DisplayInfo();
            System.out.println();
        }
    }
}
