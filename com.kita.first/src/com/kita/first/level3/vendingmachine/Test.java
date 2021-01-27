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
		
	Scanner scan = new Scanner(System.in);

	
	//메뉴판 찍기 기능
	
	//0입력시까지 반복되는 반복문 기능

		
		//번호 입력받는 기능
		System.out.print("메뉴를 입력하세요(0 입력 시 종료): ");
		num = scan.nextInt();
		
		//입력받은 번호 분기 가르기 기능
		if(num<0 || num>6) {
			System.out.println("범위 내의 숫자를 입력하세요.");
			continue;
		} else if(num == 0) {
			break;
		}
		
		game.setCount();
		game. //???????????
		
		
	}
	scan.close();
	
	//합계 찍어주는 기능
	System.out.printf("합계: %d원\n", total);
	
	
	
	
	
	

	}

