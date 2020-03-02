package Basics.Branching;

import java.util.Scanner;

public class Branching4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A=scan.nextDouble(),B=scan.nextDouble(),
                x=scan.nextDouble(),
                y=scan.nextDouble(),z=scan.nextDouble();
        if (((x<=A)&&((y<=B)||(z<=B)))
                ||((y<=A)&&((x<=B)||(z<=B)))
                ||((z<=A)&&((y<=B)||(z<=B))))
            System.out.println("Brick fits");
        else
            System.out.println("Brick doesn't fit");
    }
}
