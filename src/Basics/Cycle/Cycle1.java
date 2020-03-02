package Basics.Cycle;

import java.util.Scanner;

public class Cycle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n= scan.nextInt(),sum=0;
        while (n<=0){
            System.out.println("Error. Try again");
            n=scan.nextInt();
        }
        do{
            sum+=n;
            n--;
        }while (n!=0);
        System.out.println(sum);
    }
}
