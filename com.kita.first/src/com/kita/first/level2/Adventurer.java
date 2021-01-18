package com.kita.first.level2;

public class Adventurer {
	int strength;
	int intellegence;
	int dexturity;
	int luck;
	
	Adventurer(int strength, int intellegence, int dexturity, int luck) {
		this.strength = strength;
		this.intellegence = intellegence;
		this.dexturity = dexturity;
		this.luck = luck;
		
	}
	
	void attack() {
		System.out.println("공격");
	}
	
	void jump() {
		System.out.println("점프");
	}

}
