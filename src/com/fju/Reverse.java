package com.fju;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        for (int i = input.length()-1; i >= 0; i--) {  // Reverse String
//            char c = input.charAt(i); // get String each character position
//            System.out.print(c);
//        }

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] array = new  int[s];
        for (int k = 0; k < array.length; k++) {
            array[k] = sc.nextInt();
        }
        for (int r = array.length-1;r>=0;r--){  // Reverse array
            System.out.print(array[r]+" ");
        }
        }
    }
