package com.koreait.first;

public class Final {

	public static void main(String[] args) {
		int n1;

		n1 = 10;
		n1 = 20;
		n1 = 30; // 변수

		System.out.println(n1);

		final int n2 = 20; // 상수 !!! 값을 절대 바꿀 수 없다. 절대 바뀌어서는 안되는 값 > 상수 "final"
		System.out.println(n2);

	}

}
