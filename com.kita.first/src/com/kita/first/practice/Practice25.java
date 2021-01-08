package com.kita.first.practice;

import java.util.Scanner;

public class Practice25 { 
	public static void main(String[] args) {
	/*
		자판기 게임
	메뉴 : 콜라 사이다 캔커피 데자와 환타 웰치스
	가격 : 900 700 400 500 600 1000
	
	--메뉴--
	1. 콜라 900원
	.
	.
	.
	6. 웰치스 1000원
	
	메뉴를 입력하새요 (0 입력시 종료) : 1
	콜라 900원
	.
	.
	.
	메뉴를 입력하세요(0 입력시 종료) : 0
	합계 : 3700원
	*/
	
	/*
	String[] menuArr;
	int[] priceArr;
	int num;
	int total = 0;
	*/
	Scanner scan = new Scanner(System.in);
	
	String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
	int[] priceArr = {900, 700, 400, 500, 600, 1000};
	
	System.out.print("--메뉴--\n");
		for(int i=0;i<7;i++) {
			System.out.printf("%d. %s %d \n", i+1, menuArr[i], priceArr[i]);
	}
		
	while(true) {
		System.out.println("메뉴를 입력하세요 : ");
		int num = scan.nextInt();
		
	if(num == 0) {
			break;
		}
	
	System.out.printf("%d. %s %d \n", num, menuArr[num-1], priceArr[num-1]);
	
	}
		
		
	//-----------------------------------------------------------------	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
