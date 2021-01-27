package com.kita.first.level3;

public abstract class Animal extends Object {
	Animal() {
		super();
	}
	//abstract : new 불가능, 오직 상속만 가능
	void crying() {
		System.out.println("동물이 운다.");
	}
}
