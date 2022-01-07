package com.fju;

import java.util.Scanner;

public class StringConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your first String: ");
        String s1 = sc.nextLine();
        System.out.println("Please insert your second String: ");
        String s2 = sc.nextLine();
        if(s1.contains(s2)){
            System.out.println("It contains "+ s2 +" in "+ s1);
        }else{
            System.out.println("Your character is separated!");
        }
    }
}
