package com.kita.first.level2;

public class Method1 {
/*	void 메소드명(매개변수) {
		
	}
	
	리턴타입 메소드명(매개변수...) {
		return 리턴타입 변수;
	}
*/

	int[] arr = {1,2,3,4,5};
//	int n2 = sum(arr);
	int n3 = sum(1,2,3,4,5,6,7);
	
/*	static int sum(int[] arr) {
		int result=0;
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	} */
	
	static int sum(int...arr) {
		int result=0;
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	
	
	
	
	
	
	
	

}
