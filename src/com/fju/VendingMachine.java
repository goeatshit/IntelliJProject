package com.fju;

import java.util.Scanner;
//pizza
public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largePizza = 890;
        int mediumPizza = 590;
        int smallPizza = 290;
        int combineLarge_Small = 699;
        int total = 0;
        boolean end = false;
        String s;
        System.out.println("Menu: ");
        System.out.println("LargePizza = 890 dollars | MediumPizza = 590 dollars");
        System.out.println("SmallPizza = 290 dollars | Large+Small Pizza = 699 dollars");
        System.out.println("-----------------------------------------------------------");
        while (!end) {
            System.out.println("Please insert your money (10/50/100/200/300/400/500/800): Total : " + total);
            s = sc.nextLine();
            try {
                int m = Integer.parseInt(s);
                switch (m) {
                    case 10:
                    case 50:
                    case 100:
                    case 200:
                    case 300:
                    case 400:
                    case 500:
                    case 800:
                        total += m;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;
                }
            }catch (NumberFormatException n){
                if(s.equals("large")){
                    if(total>=largePizza){
                        total -= largePizza;
                        System.out.println("Your LargePizza is Ready!");
                        System.out.println("Here's your change : " + total);
                    }else{
                        System.out.println("Not enough money!");
                        System.out.println("You still need "+(largePizza-total));
                    }
                }else if(s.equals("medium")){
                    if(total>=mediumPizza){
                        total -= mediumPizza;
                        System.out.println("Your MediumPizza is Ready!");
                        System.out.println("Here's your change : " + total);
                    }else{
                        System.out.println("Not enough money!");
                        System.out.println("You still need "+(mediumPizza-total));
                    }
                }else if(s.equals("small")){
                    if(total>=smallPizza){
                        total -= smallPizza;
                        System.out.println("Your SmallPizza is Ready!");
                        System.out.println("Here's your change : " + total);
                    }else{
                        System.out.println("Not enough money!");
                        System.out.println("You still need "+(smallPizza-total));
                    }
                }else if(s.equals("combine")){
                    if(total>=combineLarge_Small){
                        total-= combineLarge_Small;
                        System.out.println("Your Large+Small Pizza is Ready!");
                        System.out.println("Here's your change : " + total);
                    }else{
                        System.out.println("Not enough money!");
                        System.out.println("You still need "+(combineLarge_Small-total));
                    }
                }
            }
        }
        System.out.println("End");
    }
}
