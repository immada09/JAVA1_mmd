package com.kita.first.level2;

public class MapleTest {
	public static void main(String[] args) {
	Adventurer adv = new Adventurer(10, 10, 10, 10);
	Magician mag = new Magician(10, 20, 10, 10, 100);
	
	System.out.println("모험가int: "+adv.intellegence);
	System.out.println(mag.intellegence);
	
	System.out.println(mag.mp);
	
	adv.attack();
	mag.attack();
//	adv.telleport();
	mag.teleport();
	
	}

}
