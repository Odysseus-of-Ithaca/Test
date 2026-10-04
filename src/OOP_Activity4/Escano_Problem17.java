package OOP_Activity4;

public class Escano_Problem17 {
    public static void main(String[] args) {
        double mexico = 114.0;
        double us = 312.0;
        short years = 0;


        while (mexico <= us) {
            mexico = mexico * 1.0101;
            us = us * 0.9985;
            years++;

            System.out.println("Year" + years + ": Mexico: "
                    + mexico + "M, US: " + us + "M");
        }
        System.out.println("\n It took " + years + " years for Mexico to pass the United States.");
    }
}
