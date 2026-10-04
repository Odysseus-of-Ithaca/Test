package OOP_Escano_Activity6;

class TriangleUtils {
    private TriangleUtils() {}

    static boolean isValid (double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    static double perimeter (double a, double b, double c) {
        if (!isValid(a, b, c)) {
            return -1.0;
        } else {
            return (a + b + c);
        }
    }

    static double area (double a, double b, double c) {
        if (!isValid(a, b, c)) {
            return -1.0;
        }
        double s = (a + b + c) / 2;
        double val = s * (s - a) * (s - b) * (s - c);

        return (Math.sqrt(val));
    }

    static double angleA (double a, double b, double c) {
        if (!isValid(a, b, c)) {
            return -1.0;
        }

        double numerator = (b * b) + (c * c) - (a * a);
        double denominator = 2.0 * b * c;
        double cosA = numerator / denominator;
        double radians = Math.acos(cosA);

        return (Math.toDegrees(radians));
    }
}

public class TriangleTesting {
    public static void main(String[] args) {
        System.out.println("Testing Validity:");
        System.out.println(TriangleUtils.isValid(3, 4, 5));
        System.out.println(TriangleUtils.isValid(1, 1, 3));
        System.out.println(TriangleUtils.isValid(-1, 2, 2));

        System.out.println("\nPerimeter Test:");
        System.out.println(TriangleUtils.perimeter(3, 4, 5));
        System.out.println(TriangleUtils.perimeter(1, 1, 3));

        System.out.println("\nArea Test:");
        System.out.printf("Area of 3-4-5 triangle: %.2f \n", TriangleUtils.area(3, 4, 5));
        System.out.printf("Area of equilateral (side 2): %.2f \n", TriangleUtils.area(2, 2, 2) );

        System.out.println("\nAngle Test:");
        System.out.printf("Angle opposite side 3 (in 3-4-5): %.2f° \n", TriangleUtils.angleA(3, 4, 5));
        System.out.printf("Angle opposite side 5 (in 3-4-5): %.2f° \n", TriangleUtils.angleA(5, 4, 3));
    }
}
