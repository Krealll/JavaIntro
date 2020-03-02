package Basics.Linear;

import java.util.Scanner;

public class Linear3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x=scan.nextDouble(),y=scan.nextDouble();
        System.out.println(Math.tan(x*y)*(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)));
    }
}
