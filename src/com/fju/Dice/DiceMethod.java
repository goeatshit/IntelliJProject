package com.fju.Dice;

import java.util.Random;

public class DiceMethod {
    Random ran = new Random();
    int point;
    public void roll(){
        point = ran.nextInt(6)+1;
    }
    public boolean isMax(){
        if(point==6){
            return true;
        }else {
            return false;
        }
    }
}
