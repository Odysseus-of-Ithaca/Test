package OOP_Activity1;

public class Escano_Problem5 {
    public static void main(String[] args) {

        int n = 6;
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}
