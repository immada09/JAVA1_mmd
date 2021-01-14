package com.kita.first.level2;

import java.util.Scanner;

public class Calc {
	//필드
	static int n1 = 1;
	final int N2 = 3;	//변하지않는 상수
	
	//생성자
	
	
	//메소드
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		myCalc.powerOn();
		
		int num1 = myCalc.sum(2, 3);
		System.out.println(num1);
		
		int num2 = myCalc.minus(3, 2);
		System.out.println(num2);
		
		int num3 = myCalc.multiply(3, 2);
		System.out.println(num3);
		
		double num4 = myCalc.divide(3, 2);
		System.out.println(num4);
	}
	
	public void powerOn(/*매개변수*/) {
		System.out.println("전원을 켭니다.");
	}
	
	//비void
	public static int sum(int n1, int n2) {
		int result = n1 + n2;
		
		return result;
	}
	
	int minus(int n1, int n2) {
		int result = n1 - n2;
		
		return result;
	}
	
	int multiply(int n1, int n2) {
		int result = n1 * n2;
		
		return result;
	}
	
	double divide(int n1, int n2) {
		double result = (double)n1 / n2;
		
		return result;
	}
	
	
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
	
	
	
	
	
	
	
}
