package com.fju;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculation {
    public static void main(String[] args) {
        String s;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
//      String[] num = s.split("[+*/%-]"); // extract operators
        if (s.matches(".*\\d+.*")) {  // determine if String s includes any number(digit) or special character and not alphabet characters
            for (int i = 0; i < s.length(); i++) {
                int position = i;
                char b = s.charAt(i); // get all position from String s as char b
                if (b == '+' || b == '-' || b == '*' || b == '/' || b == '%') {
                    String t = s.substring(0,position); // * end index not included but begin index is included
                    String o = s.substring(position+1); // from begin index to the last
                    int r = Integer.parseInt(t); // parse string position to Integer
                    int w = Integer.parseInt(o); // parse string position to Integer
                    switch (b){
                        case '+':
                            total = r+w;
                            break;
                        case '-':
                            total = r-w;
                            break;
                        case '*':
                            total = r*w;
                            break;
                        case '/':
                            total = r/w;
                            break;
                        case '%':
                            total = r%w;
                            break;
                    }
                }
            }
            System.out.println(s+" = "+total);
        }else{
            System.out.println("Please write an expression");
        }

    }
}

