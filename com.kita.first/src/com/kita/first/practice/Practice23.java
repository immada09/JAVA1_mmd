package com.kita.first.practice;

public class Practice23 {
	public static void main(String[] args) {
		
		int[] arr = {34, 67, 2, 11, 6, 90};
		//순차정렬
		int temp;
		
		for (int i=0; i<arr.length-1; i++) {
			for (int a=i+1; a<arr.length; a++) {
				if(arr[i]>arr[a]) {
					temp = arr[i];
					arr[i] = arr[a];
					arr[a] = temp;
				
				}
			}	
		}
		for (int n : arr) {
						System.out.println(n + " ");
					}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
