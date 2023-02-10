package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);

        double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);

        double x = (-b / (2 * a));

        if (d == 0)

            System.out.println(x);

        else if (d < 0)

            System.out.println("no roots\n");

        else if (d > 0)

            System.out.print(x1+" "+x2);
    }

}





