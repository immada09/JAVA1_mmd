package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		String str = "안녕";
		boolean result = ("안녕".equals(str));
		
		System.out.println(p.toString());
		str = "124";
		Integer.parseInt(str);
		str = "2.3";
		Double.parseDouble(str);
		Float.parseFloat(str);
		
		Math.random(); //0 ~ 0.99999999999...
		int max = 9;
		int min = 1;
		int num = (int)(Math.random() * (max - min + 1) + min);
		
		String.ValueOf(num);
		
		p.equals(obj)
	}

}
