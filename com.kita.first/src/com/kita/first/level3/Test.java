package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		ProGamer p1 = new ProGamer();
		Game game = new Game();
		p1.playGame(game);
		
		StardewVally mmd = new StardewVally();
		p1.playGame(mmd);
		
		Lol lol = new Lol();
		p1.playGame(lol);
		
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
//		System.out.println(animal);
//		System.out.println(cat);
//		System.out.println(animal == cat);
		
		System.out.println();
	
	Student minsu = new Student();
	
	for(int i=1;i<=5;i++) {
		int result = minsu.readBooks();
		switch(result) {
		case 1:	//민수가 book1을 다 읽었을 경우
			minsu.book1 = new ComicBook(3);
			System.out.println("새 만화책을 가져왔다.");
			break;
		case 2:
			minsu.book2 = new MajorTextBook(7);
			System.out.println("새 전공책을 가져왔다.");
			break;
		case 3:
			minsu.book3 = new Book(4);
			System.out.println("새 책을 가져왔다.");
			break;
		}
	System.out.println("-----------------");
	
	
	
	}

	}
	
}
