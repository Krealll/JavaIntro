package Algorithmization.odArrays;


import java.util.Scanner;

public class oda9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt(),arr[]=new int[N],minValue=Integer.MAX_VALUE,maxFreq=0, table[][]=new int[arr.length][2];
        System.out.println("Original array:");
        for (int i = 0; i <N ; i++) {
            arr[i]=(int)(Math.random()*N);
            System.out.printf("%5d",arr[i]);
        }
        System.out.printf("\n");
        maxFreq = setTable(arr ,table);
        chooseMin(table, maxFreq, minValue);
    }

    private static int setTable(int[] arr, int[][] table ) {
        int maxIndex = 0,temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    index++;
                    table[i][0] = arr[j];
                    table[i][1] = index;
                    if (index > maxIndex)
                        maxIndex =index;
                }
            }
        }
        return maxIndex;
    }

    private static void chooseMin(int[][] table, int maxFreq, int minValue) {
        for (int i = 0; i < table.length; i++) {
            if (table[i][1] == maxFreq) {
                minValue = table[i][0] < minValue ? table[i][0] : minValue;
            }
        }
        System.out.println("Asnwer :"+minValue);
    }
}