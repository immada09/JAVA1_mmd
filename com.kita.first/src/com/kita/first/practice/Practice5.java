package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("수학 응시 유형을 입력해주세요(가/나) : ");
		String mathType = scan.next();
		System.out.printf("점수를 입력해 주세요 : ");
		int score = scan.nextInt();
		
		if("가".equals(mathType)) {
			if(score < 60) {
				System.out.println("평균 미만입니다.");
			}else if(score == 60) {
				System.out.println("평균입니다.");
			} else {
				System.out.println("평균 초과입니다.");
			}
		} else if ("나".equals(mathType)) {
			if(score < 70) {
				System.out.println("평균 미만입니다.");
			}else if(score == 60) {
				System.out.println("평균입니다.");
			} else {
				System.out.println("평균 초과입니다.");
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		
	}

}
