package com.kita.first.level3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ScanNum sn = new ScanNum();
		String str = sn.inputNumString();
		int result = Utils.parseStrToInt(str);
		sn.printMsg(result);
	}

		
//		ProGamer p1 = new ProGamer();
//		Game game = new Game();
//		p1.playGame(game);
//		
//		StardewVally mmd = new StardewVally();
//		p1.playGame(mmd);
//		
//		Lol lol = new Lol();
//		p1.playGame(lol);
		
//		Animal animal = new Animal();
//		Cat cat = new Cat();
//		
//		animal.crying();
//		
//		animal = cat;	//animal = new Cat();
//		animal.crying();
//		
//		animal = new Dog();
//		animal.crying();
//		
//		boolean resdult = animal instanceof Dog;
//		System.out.println(result);
//		
//		Dog dog1 = (Dog)animal; //강제형변환
//		dog1.barking();
//		
//		System.out.println(animal);
//		System.out.println(cat);
//		System.out.println(animal == cat);
		
//		System.out.println();
//	
//	Student minsu = new Student();
//	
//	for(int i=1;i<=5;i++) {
//		int result = minsu.readBooks();
//		switch(result) {
//		case 1:	//민수가 book1을 다 읽었을 경우
//			minsu.book1 = new ComicBook(3);
//			System.out.println("새 만화책을 가져왔다.");
//			break;
//		case 2:
//			minsu.book2 = new MajorTextBook(7);
//			System.out.println("새 전공책을 가져왔다.");
//			break;
//		case 3:
//			minsu.book3 = new Book(4);
//			System.out.println("새 책을 가져왔다.");
//			break;
//		}
//	System.out.println("-----------------");
//	
//	
//	
//	}

		

		
	
	
}
