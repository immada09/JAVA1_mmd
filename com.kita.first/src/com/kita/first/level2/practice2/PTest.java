package com.kita.first.level2.practice2;

public class PTest {
	public static void main(String[] args) {
		Practice03 myP = new Practice03("마다용", 20);
		myP.setName("김개살구");
		myP.setAge(21);
		
		String myPName = myP.getName();
		int myPAge = myP.getAge();
		
		System.out.printf("이름 : %s 나이 : %d", myPName, myPAge);
		
	}
}
