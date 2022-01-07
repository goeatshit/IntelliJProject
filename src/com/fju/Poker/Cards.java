package com.fju.Poker;

public class Cards {
    // smallest type to the biggest (Club , Diamond , Heart , Spade)
    char[] cards = {'C','D','H','S'};
    String[] type = {"C","D","H","S"};
        public void GetCards(){
            System.out.println("POINTS: ");
            for (int k = 0; k < cards.length; k++) {
                for (int i = 1; i < 14; i++) {
                System.out.print(i+cards[k]+"  ");
            }
            System.out.println();
            }
            System.out.println();
            System.out.println("CARDS: ");
            for (int t = 0; t < type.length; t++) {
                for (int j = 1; j < 14; j++) {
                    System.out.print(j+type[t]+"  ");
                }
                System.out.println();
            }
        }
    }

