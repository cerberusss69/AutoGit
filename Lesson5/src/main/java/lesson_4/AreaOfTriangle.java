package lesson_4;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        double a = scanner.nextInt();
        System.out.println("side A = " + a);
        double b = scanner.nextInt();
        System.out.println("side B = " + b);
        double c = scanner.nextInt();
        System.out.println("side C = " + c);

        double p = (a + b + c) / 2.0;
        System.out.println("result p = " + p);

        double S = 0;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("результат S = " + S);
    }

    public static boolean ABC(double a, double b, double c) {
        if (a > 0 | b > 0 | c > 0) {
            return true;
        }else return false;
    }
}




