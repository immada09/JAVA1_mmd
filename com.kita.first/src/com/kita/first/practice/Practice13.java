package com.kita.first.practice;

public class Practice13 { 
	public static void main(String[] args) {
		//2~9단 세로로 쭉~
		//단 ! 단이 하나 바뀔 때 추가로 개행
		
		for (int i=2;i<10;i++) {
			for (int n=1; n<10; n++) {
				System.out.printf("%d * %d = %d\n", i,n, (i*n));
			}
			System.out.println();
		}
		
}

}
