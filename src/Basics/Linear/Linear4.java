package Basics.Linear;

import java.util.Scanner;

public class Linear4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n=scan.nextDouble(),d,b;
        d=Math.floor(n);
        b=n*1000-d*1000;
        System.out.println(b+d/1000);
    }
}
