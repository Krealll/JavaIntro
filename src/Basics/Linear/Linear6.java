package Basics.Linear;

import java.util.Scanner;

public class Linear6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x=scan.nextDouble(),y=scan.nextDouble();
        boolean flag= ((x>=-4&&x<=4)&&(y>=-3&&y<=0))||((x>=-2&&x<=2)&&(y>=0&&y<=3));
        System.out.println(flag);
    }
}
