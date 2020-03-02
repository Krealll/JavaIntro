package Algorithmization.odArrays;

import java.util.Arrays;
import java.util.Scanner;



public class oda8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt(),arr[]=new int[N],min=N,counter=0;
        for (int i = 1; i <=N ; i++) {
            arr[i-1]=(int)(Math.random()*N);
            if(arr[i-1]<min)
                min=arr[i-1];
        }
        for (int i = 1; i <=N; i++) {
            if(arr[i-1]==min)
                counter++;
        }
        if (counter==0)
            System.out.println("Array consists of same elements");
        else {
            int arr2[] = new int[N - counter];
            for (int i = 1, j = 0; i <= N; i++) {
                if (arr[i-1] != min) {
                    arr2[j] = arr[i-1];
                    j++;
                }
            }
            System.out.println("Original array" + Arrays.toString(arr));
            System.out.println("New array     " + Arrays.toString(arr2));

        }
    }
}
