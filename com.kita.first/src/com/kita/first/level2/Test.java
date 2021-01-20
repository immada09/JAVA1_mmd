package com.kita.first.level2;

import com.kita.first.level2.mamamoo.*;

public class Test {
	public static void main(String[] args) {
		com.kita.first.level2.pack1.Class1 c1 = new com.kita.first.level2.pack1.Class1();
		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
	
		Hwasa hs = new Hwasa();
		
		com.kita.first.level2.Car car = new com.kita.first.level2.Car(30);
		
		Car car1 = new Car(30);
		int car1Speed = car1.getSpeed();
		System.out.println(car1Speed);
		
		
		
	}
}
