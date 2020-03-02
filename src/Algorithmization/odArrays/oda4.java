package Algorithmization.odArrays;

import java.util.Scanner;

public class oda4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt(),ind1=0,ind2=0;
        double arr[]=new double[N],tempMax=-51.,tempMin=101.,t;
        for (int i = 0; i <N ; i++) {
            arr[i]=Math.random()*100-50;
            if(arr[i]>tempMax){
                tempMax=arr[i];
                ind1=i;
            }
            if(arr[i]<tempMin){
                tempMin=arr[i];
                ind2=i;
            }
            System.out.println(arr[i]);
        }
        t=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=t;
        for (int i = 0; i <N ; i++) {
            System.out.printf("%f ",arr[i]);

        }

    }
}
