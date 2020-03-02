package Basics.Branching;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Branching1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x=scan.nextDouble(),y=scan.nextDouble();
        boolean flag;
        if (x+y>=180||x==0||y==0)
            System.out.println("There is no such triangle");
        if (x==90.||y==90.||(180-(x+y)==90))
            System.out.println("That figure is right triangle");
        else
            System.out.println("Triangle exists");
    }
}
