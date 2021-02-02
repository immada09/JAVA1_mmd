package com.kita.first.level4;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		Object obj = 3;
		List<String> list = new ArrayList<>();
//		int[] arr = new int[5];
		list.add("안녕");
		list.add("하세요");
		list.add(2, "저는");
		list.add(0, "하이");
		list.remove(2);
		String result = list.get(1);
		System.out.println("result: " + result);
	}
}
