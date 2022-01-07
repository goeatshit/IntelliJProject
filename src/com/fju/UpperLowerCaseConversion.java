package com.fju;

import java.util.Scanner;
// Tip: ASCII 65-90 is Uppercase , 97-122 is Lowercase | Upper to Lower +32 , Lower to Upper -32 ASCII
public class UpperLowerCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);  // get all(each) position character in String s
            if(c>=65 && c<=90){
                c+=32;
            }else if(c>=97 && c<=122){
                c-=32;
            }
            System.out.print(c);
        }
    }
}
