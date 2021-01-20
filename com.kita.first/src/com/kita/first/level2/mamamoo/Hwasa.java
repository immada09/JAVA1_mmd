package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi {	
	public Hwasa() {
		super("인스타"); //부모클래스를 가리킴 (public LeeHyoRi) //디폴트에 protected의 유무
		this.sns="";
//		this.star;
//		this.music;
		
		this.drinkTea();
	}
			
}
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유교걸";
		hr.sns = "인스타";
		hr.star = 100000;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
		LeeHyoRi hr3 = new LeeHyoRi(100000);
		
		hr.sing();
		hr.drinkTea(); 
		hr.dance();
		
	

}
