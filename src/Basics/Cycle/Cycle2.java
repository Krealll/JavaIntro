package Basics.Cycle;

import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int h= scan.nextInt(),a=scan.nextInt(),b=scan.nextInt(),n=(b-a)/h+1, arr[]= new int[n];
        for (int i = 0,x=a; i <n ; i++,x+=h) {
            arr[i]=(x>2)?x:-x;
        }
        for (int i = 0; i <n ; i++) {
            System.out.printf("%3d",arr[i]);
        }
    }
}
