package com.fju;

import java.util.Scanner;

public class FindSquaredNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = sc.nextInt();
        for(int i = num1+1;i<num2;i++){ //  int i is a number in the range of num1 and num2
            double s = Math.sqrt(i);
            int w = (int)s; // filter(remove) Math.sqrt(i) that is not an Integer
            if(w*w==i){  // determine if the number between num1 and num2 which Math.sqrt(i) is an Integer
                System.out.print(i+" ");
            }
        }
    }
}
