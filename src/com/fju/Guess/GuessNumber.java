package com.fju.Guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static int guess;
    static int secret;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        GuessMethod gm = new GuessMethod();
        secret = ran.nextInt(gm.max)+gm.min;
        System.out.println("The hidden number : "+secret);
        while (!gm.end) {
            System.out.println("Please insert your number from " + gm.min + " to " + gm.max + " : ");
            guess = sc.nextInt();
            gm.Range(guess,secret);
            gm.Minus(guess,secret);
            if ((guess - secret) == 0) {
                System.out.println("Bingo");
                System.out.println("The hidden number is " + secret);
                break;
            }
            gm.Counter();
            if (gm.counter >= 7) {
                System.out.println("I'll just give you the answer...");
                System.out.println("The hidden number is " + secret);
                break;
            }
        }

    }

}

