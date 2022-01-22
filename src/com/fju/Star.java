package com.fju;

public class Star {
    public static void main(String[] args) {
        // star block
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 6; j++) {
//                if(i==0||i==4||j==0||j==5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // "X"
//        for (int t = 0; t <= 10; t++) {
//            for (int r = 0; r <= 20; r++) {
//                if(2*t==r || 2*t==20-r){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // arrow
        for (int k = 0; k <= 10; k++) {
            for (int w = 0; w <= 20; w++) {
                if (w <= 10) { // w>=10 is left arrow ; w<=10 is right arrow
                    if (2 * k == w || 2 * k == 20 - w) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
