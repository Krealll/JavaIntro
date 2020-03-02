package Algorithmization.odArrays;

import java.util.Scanner;

public class oda5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt();
        int arr[]=new int[N];
        for (int i = 1; i <=N ; i++) {
            arr[i-1]=(int)(Math.random()*N);
            if (arr[i-1]>i)
                System.out.println(arr[i-1]);
            }
        System.out.println("Original array:\n");
        for (int i = 1; i <=N ; i++) {
            System.out.printf("%4d",arr[i-1]);
        }

    }
}
