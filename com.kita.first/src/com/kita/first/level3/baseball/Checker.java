package com.kita.first.level3.baseball;

public class Checker {
//스트라이크, 볼, 아웃 갯수 확인하는 클래스
	void method() {		
		for(int i = 0;i<LEN;i++) {
			if(myArr[i]==rArr[i]) {
				strike++;
				continue;
			}
			for(int z=0; z<LEN; z++) {
				if(myArr[i]==rArr[z]) {
					ball++;
				}
			}
		} 
	}
	
//---------------------------------------------
	static boolean check(int gameCnt, Baseball ball, MyBall myBall) {
		
	}
}
