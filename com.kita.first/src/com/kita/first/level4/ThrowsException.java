package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	Scanner scan = new Scanner(System.in);
	
	void method1() throws Exception {
		System.out.println("숫자를 입력하세요: ");
		String str = scan.next();
		int num;
		num = Integer.parseInt(str);
		try {
			num = Integer.parseInt(str);
		} catch(NumberFormatException e) {
			System.out.println("문자가 섞였습니다.다시 입력해 주세요.");
		} catch(NullPointerException e) {
			System.out.println("주솟값이 연결되어 있지 않습니다.");
		} catch (Exception e) {
			System.out.println("잘못입력했습니다.");
			num = 0;
		}
		
//		try {
//			
//		} catch(NullPointerException e) {
//			
//		} catch(Exception e) {
//			
//		} finally {
//			
//		}
	}

}
