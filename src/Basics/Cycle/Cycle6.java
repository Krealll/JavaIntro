package Basics.Cycle;

public class Cycle6 {
    public static void main(String[] args) {
        char c[]=new char[256];
        for (int i = 0; i <256; i++) {
            c[i]=(char)i;
            System.out.printf("%s - %d\n",c[i],i);
        }
    }

}
