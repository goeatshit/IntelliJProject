package com.fju;

import java.util.Scanner;

public class GradeAssessment {

    public static void main(String[] args) {
        int s;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many scores: ");
        a = sc.nextInt(); // insert how many data numbers in the array
        int[] score = new int[a]; // a data numbers
        System.out.println("Please insert your scores: ");
        for (s = 0; s < score.length; s++) {
            score[s] = sc.nextInt(); // insert data into score array
            System.out.print("Student " + (s + 1) + " score is " + score[s]);
            if (score[s] >= 90 && score[s] <= 100) {
                System.out.println(" and your grade is A");
            } else if (score[s] >= 80 && score[s] <= 89) {
                System.out.println(" and your grade is B");
            } else if (score[s] >= 70 && score[s] <= 79) {
                System.out.println(" and your grade is C");
            } else if (score[s] >= 60 && score[s] <= 69) {
                System.out.println(" and your grade is D");
            } else {
                System.out.println(" and your grade is F,you Failed!");
            }
        }
    }
}







