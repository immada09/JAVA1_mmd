package com.kita.first.level3.vendingmachine;

public class PrintV {
//	public void printMenus(int len) {
//		System.out.println("--메뉴--");
//		for(int i=0; i<len; i++) {
//			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
//		}

//메뉴이름과 가격짓기
	void printMenu(Menu menu, int n) {
		String item = menu.getMenuItem(n-1);
		int price = menu.getMenuPrice(n-1);
		System.out.printf("%d. %s %d원\n", n, item, price);
	}
	
	void printTotalPrice(Game game) {
		System.out.println("합계 : %d원\n", game.getTotalPrice());
	}
}
