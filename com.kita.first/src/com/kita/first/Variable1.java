package com.kita.first;

public class Variable1 {
	public static void main (String[] args) {
		char v1;
		v1 = 'A';
		
		byte v2 = (byte)128;
//		System.out.println(v2);
		short v3;
		int v4;
		long v5;
		
		float v6 =10.1f;
		double v7 = 10.1;
		
		boolean v8; //참 거짓 구별
		v8 = true;
		v8 = false;
		
		
		int num1 = 5;
		System.out.println(num1);
		num1 = 8;
		System.out.println(num1);
		
		int n1, n2, n3;
		
		final int NUM2 = 6; //변하지 않는 상수 final int
		System.out.println(NUM2);
		//NUM2 = 7;
		
		String v9 = "안녕하세요."; //String 대문자로 시작하면 참조변수
		System.out.println(v9);
		
		Variable1 V;
	}

}
