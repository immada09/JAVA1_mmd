package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	private int count=0;
	private int totalPrice=0;
	
	public int getCount() {
		return count;
	}
	
	public void setCount() {
		count++;
	}
	
	public void  {
		this.count = count;
	}
	
	public int getTotalPrice(int getTotalPrice) {
		return  
	} //??????????????
	
	//입력받은 번호 분기 가르기
	void divideNum(int num) {
		if(num<0 || num>6) {
			System.out.println("범위 내의 숫자를 입력하세요.");
		} else if(num == 0) {
		}
	}
	
	boolean isContinue(int num) {
		if(num == 0) {
			return false;
		}
		return true;
	}
	
		//번호 입력받기
	int inputNum() {
		System.out.println("메뉴를 입력하세요(0입력시 종료):");
		return scan.nextInt();
	}
	
	//메뉴 가격 합산
	void sumMenuPrice(Menu menu, int num) {
		totalPrice += menu.getMenuPrice(num);
	}
	
	//입력받은 번호의 음료 내용 프린트 
}
