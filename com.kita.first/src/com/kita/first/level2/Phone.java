package com.kita.first.level2;

public class Phone {
	//필드
	String company = "애플";
	String name;
	String color;
	int memory;
	
	//생성자: 필드(변수)를 초기화함
	Phone () {} //기본생성자(메소드와 달리 리턴타입 없음)
		
	Phone(String name) {
		this(name, "검은색", 200);
	}
	
	Phone(String name, String color) {
		this(name, color, 200);
	}
	
	Phone(String name, String color, int memory) { //필드를 초기화함
		this.name = name;
		this.color = color;
		this.memory = memory;
	}
	
	//메소드
	//(리턴타입 or void) 메소드명(매개변수 선언) {
	//	실행식
	//	return 리턴타입변수
	//}
	String sendMsg(String str) {
		String result = str;
		
		if("".equals(str)) {
			String blank = "";
			result = blank;
		}
		System.out.println(result);
		return result;
	}
	
	void call() {
		
	}
	
	
}
