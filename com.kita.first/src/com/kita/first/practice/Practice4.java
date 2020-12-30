package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(num);
		
		String str = "짝수";
		if(num % 2 == 1) { str = "홀수"; }
		System.out.printf("%s입니다.", str);
		
		scan.close();
		}
	}

