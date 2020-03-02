package Basics.Branching;

import java.util.Scanner;

public class Branching3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1=scan.nextDouble(),y1=scan.nextDouble(),
                x2=scan.nextDouble(),y2=scan.nextDouble(),
                x3=scan.nextDouble(),y3=scan.nextDouble();
        if ((x3*(y1-y2)+y3*(x2-x1)+x1*y2-x2*y1)==0)
            System.out.println("All dots lie on one line");
        else
            System.out.println("Dots don't lie on one line");

    }
}
