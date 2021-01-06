package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		
		//int line, star = 4, z;
		//for (line = 1; line <= star; line++) {
		//	for (z = 1; z <= line;z++) {
		//		System.out.print("*");
		//	}
		//	System.out.println();
		//}
		
	
/*		
   int line = 1, st = 0, star = 4;
		
		for(int i=1; i<=star*star; i++) {
	
				System.out.print("*");
				st++;
			if(st==line) {
				System.out.println();
				line++;
				st = 0;
			}
			if(line > star) {
				break;
			}
	}
	*/
		
		/*
		for (int i = 1; j = 1; i <= star*(star+1)/2; i++) {
			System.out.print("*");
			if (i == j * (j+1)/2) {
				System.out.println();
				j++;
			}
			
		}
		*/
		
		for(int i=1; i<=star; i++) {
			for(int z=star; z>0; z--) {
				if(i<z) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=star; i++) {
			for(int z=star; z>0; z--) {
			
				System.out.print(i<z ? "" : "*");
			
			}
			System.out.println();
		}
		
		
		
}
	
}

