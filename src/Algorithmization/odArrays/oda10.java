package Algorithmization.odArrays;

import java.util.Arrays;
import java.util.Scanner;

public class oda10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt(),arr[]=new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=(int)(Math.random()*N);
        }
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));
        int n = 1;
        for (int i = 2; i < arr.length ; i +=2) {
            arr[n] = arr[i];
            n++;
        }
        for (int i = arr.length%2==0 ? arr.length/2 : arr.length/2 +1;i < arr.length; i++ ) {
            arr[i] = 0;
        }
        System.out.println("New array:");
        System.out.println(Arrays.toString(arr));
    }
}
