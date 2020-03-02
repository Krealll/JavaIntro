package Algorithmization.odArrays;

import java.util.Scanner;

public class oda7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double arr[] = new double[N];
        System.out.println("Original array:");
        for (int i = 0; i <N ; i++) {
            arr[i]= (Math.random() * 100);
            System.out.println(arr[i]);
        }
        double sum = arr[0]+arr[N-1],max=sum;

        for (int i = 1; i < N / 2 + 1; i++) {

            sum = arr[i] + arr[N - i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.printf("\n\n");
        System.out.println(max);
    }
}
