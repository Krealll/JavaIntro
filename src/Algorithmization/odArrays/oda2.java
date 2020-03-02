package Algorithmization.odArrays;

import java.util.Random;
import java.util.Scanner;

public class oda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt(), count=0;
        double arr[]=new double[N],Z=scan.nextDouble();
        for (int i = 0; i <N ; i++) {
            arr[i]=Math.random()*100;
           if (arr[i]>Z) {
               arr[i] = Z;
               count += 1;
           }
            System.out.println(arr[i]);
        }
        System.out.println(count);

    }
}
