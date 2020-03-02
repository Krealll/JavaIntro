package Algorithmization.odArrays;

import java.math.BigInteger;
import java.util.Scanner;

public class oda6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double arr[] = new double[N], sum = 0;
        for (int i = 0; i <N; i++) {
            arr[i] = (Math.random() * 100 - 50);
            if(i>1)
                if (isPrime(i))
                 sum += arr[i];

        }
        System.out.printf("Original array:\n");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n"+sum);
    }

    public static boolean isPrime(Integer n) {
        BigInteger big = BigInteger.valueOf(n);
        boolean isPrime = big.isProbablePrime((int)Math.log(n));
        return isPrime;
    }
}
