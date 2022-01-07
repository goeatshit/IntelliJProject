package com.fju.Poker;

import java.util.Random;

public class PokerGame {
    public static void main(String[] args) {
        Random ran = new Random();
        Cards c = new Cards();
        System.out.println("Smallest to Biggest Cards & Points List: ");
        System.out.println();
        c.GetCards();
        System.out.println("-------------------------------------------------------");
        // CPU
        int CPU_NUM = ran.nextInt(52); // number 0 to 51
        int CPU_CARD_POINT = (CPU_NUM%13)+1; // get point 1 to 13 circularly 4 times(0-12,13-25,26-38,39-51)
        int CPU_POS = CPU_NUM/13; // position 0 , 1 , 2 , 3
        char CPU_TYPE =  c.cards[CPU_POS]; // get card type
        System.out.println("CPU: "+CPU_CARD_POINT+CPU_TYPE+"("+CPU_NUM+")");

        // USER
        int USER_NUM = ran.nextInt(52);
        int USER_CARD_POINT = (USER_NUM%13)+1;
        int USER_POS = USER_NUM/13;
        char USER_TYPE = c.cards[USER_POS];
        System.out.println("USER: "+USER_CARD_POINT+USER_TYPE+"("+USER_NUM+")");

        if(USER_TYPE>CPU_TYPE || USER_CARD_POINT>CPU_CARD_POINT && USER_TYPE == CPU_TYPE ){
            System.out.println("YOU WIN!!!");
        }else {
            System.out.println("YOU LOSE!!!");
        }
    }
}
