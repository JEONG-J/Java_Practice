import java.util.Scanner;

public class Practice_1주차 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the length of the first side>> ");
        Double a = scanner.nextDouble();

        System.out.print("Write the length of the second side>> ");
        Double b = scanner.nextDouble();

        System.out.print("Write the length of the third side>> ");
        Double c = scanner.nextDouble();

        System.out.println(maxValue(a, b, c));

        if (triAngle(a, b, c)) {
            System.out.println("We can construct a triangle with these lengths");
            System.out.println(checkAcute(a, b, c));
        } else {
            System.out.println("not make triangle");
        }
    }

    private static Double maxValue(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    private static Boolean triAngle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static String checkAcute(double a, double b, double c) {
        if (a * a + b * b > c * c && b * b + c * c > a * a && c * c + a * a > b * b) {
            return "tihs triangle is an acute triangle";
        } else {
            return "This triangle is not an acute triangle";
        }
    }
}
