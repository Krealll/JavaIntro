package Basics.Linear;

import java.util.Scanner;

public class Linear2 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        double a=scan.nextDouble(),b=0.,c;
        boolean flag;
        do{
            flag = false;
            try {
                b= scan.nextDouble();
                if (b==0)
                    throw new Exception("second parameter cannot be zero, try again:");
            }
            catch (Exception q)
            {
                flag = true;
                System.out.println(q.getMessage());

            }
        }while (flag);
        c = scan.nextDouble();
        System.out.println((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b));
    }
}
