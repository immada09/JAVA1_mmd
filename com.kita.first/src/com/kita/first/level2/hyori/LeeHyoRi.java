package com.kita.first.level2.hyori;

public class LeeHyoRi {
	//필드
	public String music; //퍼블릭
	protected String sns; //디폴트
	private int star; //프라이빗
	
	//생성자
	public LeeHyoRi() {}
	
	protected LeeHyoRi(String sns) {
		this.sns = sns;
	}
	
	private LeeHyoRi(int star) {
		this.star = star;
	}
	
	//메소드
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
	public void sing() {}
	protected void drinkTea() {}
	private void dance() {}

}
