package com.fju.McDonald;

import java.util.ArrayList;
import java.util.List;

public class GetList {
    List<Menu> m = new ArrayList<>();

    public void getData(){
        for (int i = 0; i < m.size(); i++) {
            Menu menu = m.get(i);
            System.out.println(menu.getId()+") "+menu.getName()+menu.getPrice());
        }
    }
}
