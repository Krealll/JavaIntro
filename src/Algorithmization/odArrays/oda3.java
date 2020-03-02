package Algorithmization.odArrays;

import java.util.Random;
import java.util.Scanner;

public class oda3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt(), countZ=0,countNeg=0;
        double arr[]=new double[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=Math.random()*100-50;
            if (arr[i]==0)
                countZ+=1;
            if(arr[i]<0)
                countNeg+=1;
            System.out.println(arr[i]);
        }
        System.out.printf("%d -zero, %d - negative, %d - positive",countZ,countNeg,N-(countNeg+countZ));

    }
}
