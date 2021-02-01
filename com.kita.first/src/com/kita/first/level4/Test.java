package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent() {
			int childField;
			
			void childMethod() {};
			
			@Override
			void parentMethod() {
				System.out.println("자식객체입니다.");
			};
		};
		
		p.parentMethod();
		
		
		
		
		
		
		
		
//		ThrowsException te = new ThrowsException() {
//			try {
//				te.method1();
//			} catch(Exception e) {
//				
//			}
//		}
		

		////		AkmuAlbum album = new AkmuAlbum(); //불가능
//		AkmuAlbum album1 = new MusicPlayer(); //가능
//		IUAlbum album2 = new MusicPlayer(); //가능
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
//		album2.playIUAlbum();
//		album2.stopIUAlbum();
//		
//		MusicPlayer myMp3 = (MusicPlayer)album1;
//		myMp3.playMJAlbum();
//		
		
		
		
		
		
	}

}
