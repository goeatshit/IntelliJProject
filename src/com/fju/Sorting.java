package com.fju;

import java.util.Scanner;

public class Sorting {
    //Compare number from left to right last number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many data numbers: ");
        int a = sc.nextInt();
        int[] num = new int[a]; // a data numbers
        System.out.print("Please insert your numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt(); // insert a data
        }
        for (int j = 0; j < num.length-1 ; j++) {  // 0,1,2,3 position number to array num length-1
            for (int k = j+1; k < num.length; k++) {  // ex: when j = 1 , k is 2,3,4 to array num length(compare j position number to other k position numbers respectively except for j itself)
                if(num[j]>num[k]){   // if left position number is bigger than other right position numbers respectively then switch position until comparison finished
                   int tmp = num[j]; // preserve num[j] data number
                    num[j] = num[k]; // num[j] data has num[k] data number
                    num[k] = tmp; // num[k] data has num[j] data number
                }
            }
        }
        System.out.print("Sorting: ");
        for (int r : num){
            System.out.print(r+" ");
        }
    }

}
