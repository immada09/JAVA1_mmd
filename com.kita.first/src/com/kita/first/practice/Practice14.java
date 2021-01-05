package com.kita.first.practice;

public class Practice14 {
	public static void main(String[] args) {
		// 구구단 가로로 정렬
		
		for (int i=2;i<10;i++) {
			for (int n=1;n<10;n++) {
				System.out.printf("%d * %d = %2%d\t", i, n, (i*n));
			}
			System.out.println("\n");
		}
	}

}
