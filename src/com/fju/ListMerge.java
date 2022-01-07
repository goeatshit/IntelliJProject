package com.fju;

import java.util.Scanner;

public class ListMerge {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        a = sc.nextInt();
        int[] list1 = new int[a];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = sc.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        b = sc.nextInt();
        int[] list2 = new int[b];
        for (int j = 0; j < list2.length; j++) {
            list2[j] = sc.nextInt();
        }
        System.out.print("list1 is ");
        for (int k : list1) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.print("list2 is ");
        for (int r : list2) {
            System.out.print(r + " ");
        }
        int mergedLength = list1.length+list2.length;
        int[] list3 = new int[mergedLength];
        int pos = 0;
        // put all elements in list1 & list2 into list3
        for (int element1:list1) {
            list3[pos] = element1;
            pos++;
        }
        for (int element2:list2) {
            list3[pos] = element2;
            pos++;
        }
        // Bubble Sorting merged list
        for (int o = 0; o < list3.length-1; o++) {
            for (int z = o + 1; z < list3.length; z++) {
                if (list3[o] > list3[z]) {
                    int tmp = list3[o];
                    list3[o] = list3[z];
                    list3[z] = tmp;
                }
            }
        }
        System.out.println();
        System.out.print("list3 is ");
        for (int f : list3) {
            System.out.print(f + " ");
        }
    }
}