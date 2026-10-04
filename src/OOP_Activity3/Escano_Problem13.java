package OOP_Activity3;
import java.util.Scanner;

public class Escano_Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short[] arr = new short[10];

        System.out.println("Enter 10 Numbers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextShort();
        }

        System.out.print("Enter Target Sum: ");
        short sum = sc.nextShort();

        short pairCount = 0;

        System.out.print("Pairs: ");
        for (int i = 0; i < 10; i++){
            for  (int j = i + 1; j < 10; j++){
                if (arr[i] + arr[j] == sum){
                    if (pairCount > 0) System.out.print(", ");
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                    pairCount++;
                }
            }
        }

        if (pairCount == 0){
            System.out.println("No pairs found");
        }
        System.out.println();

        sc.close();
    }
}
