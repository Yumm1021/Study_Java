package com.koreait.first.test;

import java.util.ArrayList; //배열로 이루어져 있음, 수정이 많지 않고 읽기 전용 위주로 사용
import java.util.LinkedList; //노드로 이루어져 있음 , 수정이 잦고 수정 삭제 위주로 사용
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// 둘은 상속관계 , List가 부모
		// Integer은 정수형 타입 그래서 ArrayList는 정수형 타입을 가리키고 있다

		list.add(1); // add에는 object타입
//		list.add("1");
//		list.add(true);
//		list.add(1.1);

		Object obj = 1;
		obj = "1";
		obj = true;
		obj = 1.1;
                       
		int a = list.get(0);

		System.out.println("a : " + a);

	}

}