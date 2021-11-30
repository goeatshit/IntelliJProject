package com.fju;

import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String m;
        int total = 0;
        int price = 0;
        int oneway_ticket = 150;
        double full_ticket = (2 * oneway_ticket) * 0.8;
        boolean end = false;
        System.out.println("Fare:");
        System.out.println("Oneway ticket = 150 dollars | Full ticket = 240 dollars ( 20% discount!!! )");
        System.out.println("150 dollars per ticket");
        System.out.println("---------------------------------------------------------------------------");
        while (!end) {
            System.out.println("How many tickets do you want to buy:  Total: " + total + " | Price: " + price);
            s = sc.nextLine();
            try {
                int ticketNum = Integer.parseInt(s);
                switch (ticketNum) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        total += ticketNum;
                        break;
                    default:
                        break;
                }
                System.out.println("How much do you want to deposit:  Total: " + total + " | Price: " + price);
                m = sc.nextLine();
                int yourMoney = Integer.parseInt(m);
                switch (yourMoney) {
                    case 100:
                    case 200:
                    case 300:
                    case 400:
                    case 500:
                    case 600:
                    case 700:
                    case 800:
                        price += yourMoney;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;

                }
            } catch (NumberFormatException e) {
                if (s.equals("oneway")) {
                    if (price >= oneway_ticket) {
                        price -= oneway_ticket;
                        total--;
                        System.out.println("You bought a oneway ticket!");
                        System.out.println("You still have : " + price);
                    } else {
                        System.out.println("Not enough money");
                        System.out.println("You still need : " + (oneway_ticket - price));
                    }
                } else if (s.equals("full")) {
                    if (price >= full_ticket) {
                        price -= full_ticket;
                        total -= 2;
                        System.out.println("You bought a full ticket!");
                        System.out.println("You still have : " + price);
                    } else {
                        System.out.println("Not enough money!");
                        System.out.println("You still need : " + (int) (full_ticket - price));
                    }
                } else if (s.equals("multiple")) {
                    if (total % 2 != 0) {
                        if (price >= (total * oneway_ticket)) {
                            price -= total * oneway_ticket;
                            System.out.println("You bought " + total + " oneway tickets!");
                            total -= total;
                            System.out.println("You still have : " + price);
                        } else {
                            System.out.println("Not enough money!");
                            System.out.println("You still need : " + ((total * oneway_ticket) - price));
                        }
                    } else if (total % 2 == 0) {
                        if (price >= ((total / 2) * full_ticket)) {
                            price -= (total / 2) * full_ticket;
                            System.out.println("You bought " + total + " full tickets!");
                            total -= total;
                            System.out.println("You still have : " + price);
                        } else {
                            System.out.println("Not enough money!");
                            System.out.println("You still need : " + (int) (((total / 2) * full_ticket) - price));
                        }
                    }

                }
            }

        }
        System.out.println("Have a nice day!");

    }

}



