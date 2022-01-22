package com.fju.McDonald;

import java.util.*;

public class McDonaldSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu_LinkedHashMap ma = new Menu_LinkedHashMap();
        Map<Integer, String> store = new LinkedHashMap<Integer, String>();
        int stack = 0;
        String id;
        ma.getMenu();
        while (!ma.end) {
            System.out.print("請輸入餐點: ");
            id = sc.next();
            try {
                System.out.print("請輸入數量: ");
                ma.input_amount = sc.nextInt();
                ma.input_id = Integer.parseInt(id);
                if (ma.input_id != 0 || ma.input_amount != 0) {
                    System.out.println("目前餐點: ");
                    stack++;
                    for (String stored_order : ma.getKeys(ma.item_info, ma.input_id)) { // get keys from value
                        store.put(stack, stored_order);
                    }
                    ma.Counts();
                    for (Map.Entry<Integer, String> a : store.entrySet()) {
                        int store_key = a.getKey(); // stack number
                        String store_value = a.getValue(); // stored_order
                        System.out.println(store_key + ". " + store_value + " " + ma.store_amounts[ma.item_info.get(store_value) - 1] + "份");
                    }
                }
                if (ma.input_id == 0) {
                    System.out.println("所有餐點: ");
                    for (Map.Entry<Integer, String> a : store.entrySet()) {
                        int store_key = a.getKey(); // stack number
                        String store_value = a.getValue(); // stored_order
                        System.out.println(store_key + ". " + store_value + " " + ma.store_amounts[ma.item_info.get(store_value) - 1] + "份");
                        ma.total_price += ma.item_price[ma.item_info.get(store_value) - 1] * ma.store_amounts[ma.item_info.get(store_value) - 1];
                    }
                    System.out.print("合計: ");
                    System.out.println(ma.total_price);
                    store.clear(); // clear store LinkHashMap
                    Arrays.fill(ma.store_amounts, 0); // clear store_amounts array
                    stack = 0; // reset stack to 0
                    ma.total_price = 0; // reset total price to 0
                }
                System.out.println("====================");
                ma.getMenu();
            } catch (Exception i) {
                if (id.equals("q")) {
                    ma.end = true;
                    System.exit(0);
                }

            }
        }
    }
}





