package OOP_Activity1;
import java.util.Arrays;
import java.util.Scanner;

public class Trial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte[] nums = new byte[5];

        System.out.println("Enter 5 Numbers: ");
        for (byte i = 0; i < 5; i++) {
            nums[i] = input.nextByte();
        }
         byte lastEle = nums[4];

        for (byte i = 4; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = lastEle;

        System.out.println("Shifted: " + Arrays.toString(nums));

        input.close();
    }
}
