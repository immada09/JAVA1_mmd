package com.kita.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList<MenuItem>();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노", 2000));
		arr.add(new MenuItem("카페라떼", 3000));
		arr.add(new MenuItem("자몽주스", 1500));
		arr.add(new MenuItem("핫초코", 2500));
	}

	public void menuSetter(MenuItem mi) {
		arr.add(mi);
	}
	
	public String showMenus() {
		System.out.println("-Menu-");
		for(int i=0;i<arr.size();i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s\t\t, %d원", i+1, m.getName());
		}
		return "";
	}
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
}
