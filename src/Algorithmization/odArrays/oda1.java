package Algorithmization.odArrays;

import java.util.Random;
import java.util.Scanner;

public class oda1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int N=scan.nextInt(), arr[]=new int[N],K=scan.nextInt(),sum=0;
        for (int i = 0; i <N ; i++) {
            arr[i]=rnd.nextInt(101);
            if(arr[i]%K==0)
                sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);

    }
}
