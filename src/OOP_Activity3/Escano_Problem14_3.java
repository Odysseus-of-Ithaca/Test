package OOP_Activity3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;

public class Escano_Problem14_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short[] arr1 = new short[5];
        short[] arr2 = new short[5];

        System.out.println("Enter Numbers for Set A: ");
        for(int i = 0; i < 5; i++){
            arr1[i] = sc.nextShort();
        }
        System.out.println("Enter Numbers for Set B: ");
        for(int i = 0; i < 5; i++){
            arr2[i] = sc.nextShort();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        TreeSet<Short> set1 = new TreeSet<>();
        TreeSet<Short> set2 = new TreeSet<>();

        for (short nums : arr1) set1.add(nums);
        for (short nums : arr2) set2.add(nums);

        TreeSet<Short> Intersect = new TreeSet<>(set1);
        Intersect.retainAll(set2);

        System.out.print("Intersection: ");
        for (short nums : Intersect) {
            System.out.print(nums + " ");
        }
        System.out.println();

        TreeSet<Short> Union = new TreeSet<>(set1);
        Union.addAll(set2);

        System.out.print("Union: ");
        for (short nums : Union) {
            System.out.print(nums + " ");
        }
        System.out.println();

        sc.close();
    }
}
