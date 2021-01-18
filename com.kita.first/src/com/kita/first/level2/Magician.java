package com.kita.first.level2;

public class Magician extends Adventurer{
	int mp;
	
	Magician(int strength, int intellegence, int dexturity, int luck, int mp) {
		super(strength, intellegence, dexturity, luck);
		this.mp = mp;
	}
	
	@Override
	void attack() {
		System.out.println("마법공격");
	}
	
	void teleport() {
		System.out.println("이동");
	}
	
	@Override
	void jump() {
		System.out.println("마법점프");
	}
	

}
