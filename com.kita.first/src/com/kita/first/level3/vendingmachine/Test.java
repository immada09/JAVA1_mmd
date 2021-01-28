package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
	int len = 6;
	Menu menu = new Menu(len);
	PrintV print = new PrintV();

	menu.inputArrItems();
	menu.inputArrPrices();
	
		System.out.println("--메뉴--");
		for(int i=1; i<=len; i++) {
			print.printMenu(menu, i);
		}
		
	//메뉴,가격 배열에 값 입력
	Game game = new Game();
	int myNum;
	
	while(true) {
		myNum = game.inputNum();
		
		if(myNum<1||myNum>len) {
			System.out.println("범위내의 숫자를 입력하세요.");
			continue;
		} else if(myNum==0) {
			break;
		}
		
		game.setCount();
		game.sumMenuPrice(menu, myNum);
		print.printMenu(menu, myNum);
	}
		
	print.printTotalPrice(game);
	
	}
}

