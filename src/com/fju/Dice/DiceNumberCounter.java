package com.fju.Dice;

public class DiceNumberCounter {
    public static void main(String[] args) {
        int[] counts = new int[6];
        DiceMethod dm = new DiceMethod();
        for (int i = 1; i <= 10; i++) {
            dm.roll();
            System.out.print("Rolled dice number ---> " + dm.point);
            counts[dm.point - 1]++;
            String s = dm.isMax() ? "*" : ""; // if point is 6 print * behind , else print empty string
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        for (int j = 0; j < counts.length; j++) {
            System.out.println("The dice number " + (j + 1) + " appeared " + counts[j] + " times ");
        }
    }
}
