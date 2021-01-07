package com.kita.first.practice;

public class Practice22 {
	public static void main(String[] args) {
		//정수배열 만들어서  1~100까지 값을 각각 배열 안에 넣고
		//배열 안에 든 값을 찍어보자
		// 1, 2, 3, ... , 100
		
		int[] meme = new int[10];
		for(int i = 0; i<meme.length; i++) {
			meme[i] = i+1;
		}
		
		for(int i = 0; i<meme.length; i++) {
			System.out.printf("%d", meme[i]);
			if(i!=meme.length-1) {
				System.out.print(", ");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
