package Basics.Cycle;

import java.util.Scanner;

public class Cycle5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double e=scan.nextDouble(),n=scan.nextInt(),sum=0,temp;
        while (n>0) {
            temp = Math.pow(2, -n) + Math.pow(3, -n);
            if (temp >= e)
                sum += temp;
            n--;
        }
        System.out.println(sum);
    }
}
