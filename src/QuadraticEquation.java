import java.util.Scanner;
import java.lang.Math;
    public class QuadraticEquation {
        public static void main(String[] args) {
            double a;
            double b;
            double c;
            System.out.println("Input a, b, c: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();

            if (a == 0) {
                double x = -c / b;
                System.out.println("Only one equation= " + x);

            } else {
                double delta = Math.pow(b, 2) - 4 * a * c;

                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                    double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                    System.out.printf("There are two equations: " + x1, x2);

                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("There is a double root: " + x);
                }else
                    System.out.println("No any equation!");
            }

        }
    }


