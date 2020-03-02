package Basics.Branching;

import java.util.Scanner;

public class Branching5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        if (x<=3)
            System.out.println(x*x-3*x+9);
        else
            System.out.println(1/(x*x*x+6));
    }
}
