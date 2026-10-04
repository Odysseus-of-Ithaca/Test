package OOP_Activity3;
import java.util.Scanner;
import java.util.Arrays;

public class Escano_Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short[] arr1 = new short[5];
        short[] arr2 = new short[5];
        byte a = 0;
        byte b = 0;

        System.out.println("Enter 5 Numbers for Set 1: ");
        for(int i = 0; i < 5; i++){
            arr1[i] = sc.nextShort();
        }
        System.out.println("Enter 5 Numbers for Set 2: ");
        for(int i = 0; i < 5; i++){
            arr2[i] = sc.nextShort();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Intersection: ");
        while(a < arr1.length && b < arr2.length){
            while (a > 0 && a < arr1.length && arr1[a] == arr1[a - 1]) a++;
            while (b > 0 && b < arr2.length && arr2[b] == arr2[b - 1]) b++;
            if (a >= arr1.length || b >= arr2.length) break;

            if(arr1[a] == arr2[b]){
                System.out.print(arr1[a] + " ");
                a++;
                b++;
            } else if (arr1[a] > arr2[b]){
                b++;
            } else {
                a++;
            }
        }
        System.out.println();

        a = 0;
        b = 0;

        System.out.println("Union: ");
        while (a < arr1.length && b < arr2.length){
            while (a > 0 && a < arr1.length && arr1[a] == arr1[a - 1]) a++;
            while (b > 0 && b < arr2.length && arr2[b] == arr2[b - 1]) b++;
            if (a >= arr1.length || b >= arr2.length) break;

            if (arr1[a] < arr2[b]){
                System.out.print(arr1[a] + " ");
                a++;
            } else if (arr1[a] > arr2[b]){
                System.out.print(arr2[b] + " ");
                b++;
            } else {
                System.out.print(arr1[a] + " ");
                a++;
                b++;
            }
        }

        while (a < arr1.length) {
            while (a > 0 && a < arr1.length && arr1[a] == arr1[a - 1]) a++;
            if (a < arr1.length) {
                System.out.print(arr1[a] + " ");
                a++;
            }
        }

        while (b < arr2.length) {
            while (b > 0 && b < arr2.length && arr2[b] == arr2[b - 1]) b++;
            if (b < arr2.length) {
                System.out.print(arr2[b] + " ");
                b++;
            }
        }
        System.out.println();

        sc.close();
    }
}