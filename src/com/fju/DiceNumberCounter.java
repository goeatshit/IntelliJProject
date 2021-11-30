package com.fju;

import java.util.Random;

public class DiceNumberCounter {
    static int r;
    public static void main(String[] args) {
        Random ran = new Random();
        int[] counts = new int[6];
        for (int i = 1; i <= 10; i++) {
            r = ran.nextInt(6) + 1;
            System.out.println("Rolled dice number ---> "+r);
            switch (r){
                case 1:
                    counts[0]++; // counts array position 0 is the times that number 1 appeared
                    break;
                case 2:
                    counts[1]++; // counts array position 1 is the times that number 2 appeared
                    break;
                case 3:
                    counts[2]++; // counts array position 2 is the times that number 3 appeared
                    break;
                case 4:
                    counts[3]++; // counts array position 3 is the times that number 4 appeared
                    break;
                case 5:
                    counts[4]++; // counts array position 4 is the times that number 5 appeared
                    break;
                case 6:
                    counts[5]++; // counts array position 5 is the times that number 6 appeared
                    break;
                default:
                    break;
            }

        }
        System.out.println("---------------------------------------");
        for(int j = 0;j<counts.length;j++){
            System.out.println("The dice number "+(j+1)+" appeared "+counts[j]+" times ");
        }

    }
}
