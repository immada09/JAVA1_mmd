package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		//1~6까지 랜덤으로 메뉴뽑기를- 한 번 한 후에
		//마음에 들면  Y 눌러서 반복 끝내고
		//"오늘의 메뉴는 00입니다."
		//마음에 안들면 다시 랜덤뽑기

		Scanner sc = new Scanner(System.in);
		String menu;
		boolean again = true;
		do {
			//메뉴뽑기		
		int rNum = (int)(Math.random() *6) + 1;
		
		if(rNum == 1) {
			menu = "피자";
		} else if(rNum == 2) {
			menu = "도넛";
		} else if(rNum == 3) {
			menu = "연어";
		} else if(rNum == 4) {
			menu = "참치";
		} else if(rNum == 5) {
			menu = "수제비";
		} else {
			menu = "버블티";
		}
		System.out.println("뽑힌메뉴 : " + menu);
		System.out.println("마음에 듭니까? (Y/N)");
		String result = sc.next();
		if("Y".equals(result)) {
			break;
		}
		
		} while(again);
		System.out.printf("오늘 메뉴는 %s 입니다.", menu);
		

	}

	}

//아악 미치도록 어려워 죽을거같아 눈물난다. . . 잠도오고 머리도 안돌아가고 집에는 가고싶고 마크나 하고싶고 엉엉