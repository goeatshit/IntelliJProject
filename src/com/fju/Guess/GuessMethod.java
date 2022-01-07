package com.fju.Guess;

public class GuessMethod {
    boolean end = false;
    int counter = 0;
    int max = 100;
    int min = 1;

    public void Minus(int guess, int secret) {
        if ((guess - secret) > 0) {
            System.out.println("Smaller");
        } else if ((guess - secret) < 0) {
            System.out.println("Bigger");
        }
    }

    public void Counter() {
        counter++;
        if (counter == 3) {
            System.out.println("Do you know how to guess?");
        } else if (counter == 5) {
            System.out.println("Just give up");
        }
    }

    public void Range(int guess, int secret) {
        if (guess > min && guess < secret) {
            min = guess;
        } else if (guess < max && guess > secret) {
            max = guess;
        }
    }
}

