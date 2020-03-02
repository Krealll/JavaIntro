package Basics.Cycle;

import java.util.Scanner;

public class Cycle8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int k[]=new int[10];
        Integer  A=scan.nextInt(),B=scan.nextInt();
        String s = new String (A.toString()+B.toString());
        for (int i = 0; i < s.length(); i++) {
            k[(s.charAt(i)-48)]++;
        }
        for (int i = 0; i <10 ; i++) {
            if (k[i]>0)
                System.out.println(i);
        }

    }
}
