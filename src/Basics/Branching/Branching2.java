package Basics.Branching;

import java.util.Scanner;

public class Branching2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt(),t,m;
        if(c<d)
            t=c;
        else
            t=d;
        if(a<b)
            m=a;
        else
            m=b;
        System.out.println((m>t)?m:t);
    }
}
