package OOP_Activity3;
import java.util.Scanner;

public class Escano_Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature Scale (C = Celsius, F = Fahrenheit, & K = Kelvin): ");
        char scale = sc.next().toLowerCase().charAt(0);

        System.out.print("Converting to (C = Celsius, F = Fahrenheit, & K = Kelvin): ");
        char newScale = sc.next().toLowerCase().charAt(0);

        System.out.print("Enter Temperature: ");
        double tempVal = sc.nextShort();

        double result = 0;
        if (newScale == 'c') {
            result = toCel(scale, tempVal);
        } else if (newScale == 'f') {
            result = toFah(scale, tempVal);
        } else if (newScale == 'k') {
            result = toKel(scale, tempVal);
        }

        System.out.printf("Result: %.2f %c\n", result, Character.toUpperCase(newScale));

        sc.close();
    }

    static double toCel (double current, double tempVal) {
        if (current == 'f' || current == 'F') return (tempVal - 32) * 5/9;
        if (current == 'k' || current == 'K') return (tempVal - 273.15);
        return tempVal;
    }

    static double toFah (double current, double tempVal) {
        if (current == 'c' || current == 'C') return (tempVal * 9/5) + 32;
        if (current == 'k' || current == 'K') return (tempVal - 273.15) * 9/5 + 32;
        return tempVal;
    }

    static double toKel (double current, double tempVal) {
        if (current == 'c' || current == 'C') return tempVal + 273.15;
        if (current == 'f' || current == 'F') return (tempVal - 32) * 5/9 + 273.15;
        return tempVal;
    }
}
