package com.kita.first.level2;

public class IMac {
	private int memory = 500;
	private String color = "스페이스 그레이";
	
	public IMac(int memory, String color) {
		this.memory = memory;
		this.color = color;
		
	}
	public void setmemory(int memory) {
		this.memory = memory;
		
	}
	public int getmemory() {
		return memory;
		
	}
	public void setcolor(String color) {
		this.color = color;
		
	}
	public String getcolor() {
		return color;
	}

}
