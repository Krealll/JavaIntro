package Basics.Linear;

import java.util.Scanner;

public class Linear5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t=scan.nextLong();
        System.out.printf("%dч%dмин%dc",(int)(t/3600),(int)((t%3600)/60),(int)(t%60));
    }
}

