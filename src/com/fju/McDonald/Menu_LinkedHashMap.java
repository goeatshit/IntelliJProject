package com.fju.McDonald;

import java.util.*;

public class Menu_LinkedHashMap {
    int input_id;
    int input_amount;
    int total_price;
    int[] store_amounts = new int[7];
    boolean end = false;
    int[] item_kcal = {534, 446, 244, 321, 376, 397, 117};
    int[] item_price = {65, 55, 60, 50, 45, 35, 30};
    String[] sys_exit = {"q) 結束(離開程式)"};
    Map<String, Integer> item_info = new LinkedHashMap<String, Integer>();
    public void getMenu() {
        // *** LinkedHashMap , ArrayList & TreeMap preserves the insertion order , but HashMap doesn't
        item_info.put("大麥克",1);
        item_info.put("雙層吉士牛肉堡",2);
        item_info.put("麥脆雞原味",3);
        item_info.put("麥香魚",4);
        item_info.put("薯條大包",5);
        item_info.put("可樂",6);
        item_info.put("冰紅茶",7);
        item_info.put("結算",0);
        for (Map.Entry<String, Integer> m : item_info.entrySet()) {
            String item_info_key = m.getKey();
            int item_info_value = m.getValue();
            System.out.println(item_info_value + ") " + item_info_key);
        }
        System.out.println(sys_exit[0]);
    }
    public Set<String> getKeys(Map<String, Integer> item_info,Integer item_info_value){ // get keys from value method
        Set<String> result = new LinkedHashSet<>();
        if(item_info.containsValue(item_info_value)){
            for (Map.Entry<String,Integer> map : item_info.entrySet()){
                if (Objects.equals(map.getValue(),item_info_value)){
                    result.add(map.getKey());
                }
            }
        }
        return result;
    }
    public void Counts() {
        while (input_id != 0) {
            if (item_info.get("大麥克") == input_id) {
                store_amounts[0] += input_amount;
            } else if (item_info.get("雙層吉士牛肉堡") == input_id) {
                store_amounts[1] += input_amount;
            } else if (item_info.get("麥脆雞原味") == input_id) {
                store_amounts[2] += input_amount;
            } else if (item_info.get("麥香魚") == input_id) {
                store_amounts[3] += input_amount;
            } else if (item_info.get("薯條大包") == input_id) {
                store_amounts[4] += input_amount;
            } else if (item_info.get("可樂") == input_id) {
                store_amounts[5] += input_amount;
            } else if (item_info.get("冰紅茶") == input_id) {
                store_amounts[6] += input_amount;
            }
        }
    }
}