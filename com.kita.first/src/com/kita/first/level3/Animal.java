package com.kita.first.level3;

public abstract class Animal extends Object {
	//필드
	private String name = "동물";
	
	//생성자
	Animal() {
		super();
	}
	//abstract : new 불가능, 오직 상속만 가능
	
	//메소드
//	private abstract crying(); //안됨
	abstract void crying(); //가능

	
//	void crying() {
//		System.out.println("동물이 운다.");
//	}
}
