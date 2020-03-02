package Basics.Cycle;

import java.math.BigInteger;

public class Cycle4 {
    public static void main(String[] args) {
        BigInteger p= BigInteger.valueOf(1);
        for (int i = 1; i <=200; i++) {
            p=p.multiply(p.valueOf(i*i));
            System.out.println(p);
        }

    }
}
