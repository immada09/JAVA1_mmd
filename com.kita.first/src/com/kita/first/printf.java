package com.kita.first;

public class printf {
	public static void main(String[] args) {
		//System.out.print("안녕");
		//System.out.println("안녕못해");
		//System.out.printf("문자열 형식", arg1, arg2...);
		
		//int age = 10;
		//String name = "마다";
		//마다는 열살이다.
		//System.out.println(name + "는" + age + "살이다.");
		//System.out.printf("%s는 10살이다.",name);
		//System.out.printf("%s는 %d살이다.",name, age);
		
		//올해로 20살이된 김땡땡은 알바를 시작하여 매달 123만원을 받게 되었다.
		//김땡땡은 월급의 50%인 615000원을 떼어 A저축은행의 연 이자율 2.33%짜리 적금에 넣기로 결심했다.
		
		int age = 20;
		String name = ("마다");
		int salary = 1_230_000;
		int percent = 50;
		int savings = 615_000;
		String bank = "A"; //(s) //char bank = 'A'; (c)
		double rateOfInterest = 2.333333333333; //(f)
		
		System.out.printf("올해로 %d살이 된 %s은\n알바를 시작하여 매달 %,d원을 받게 되었다.\n",age, name, salary);
		System.out.printf("%s은 월급의 %d%%인 %d원을 떼어\n%s저축은행의 연 이자율 %.2f%%짜리 적금에 넣기로 결심했다.",name, percent, savings, bank, rateOfInterest);
		
		System.out.println();
		
		boolean bool = true;
		System.out.println("%b", bool);
		
	}

}
