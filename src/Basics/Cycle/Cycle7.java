package Basics.Cycle;

import java.util.Scanner;
import java.util.Vector;

public class Cycle7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt(),m=scan.nextInt();
        for (int i = n; i <=m ; i++) {
            showDel(i);
        }
    }

    public static void showDel(int x){
        Vector dividers = new Vector();

        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x % i == 0)
            {
                dividers.add(i);
                if (i * i != x)
                {
                    dividers.add(x/i);
                }
            }
        }
        if (dividers.size()!=0)
            System.out.printf("\n %d --",x);
        for (int i = 0; i < dividers.size(); i++)
            System.out.printf("%d ",dividers.get(i));
    }

}
