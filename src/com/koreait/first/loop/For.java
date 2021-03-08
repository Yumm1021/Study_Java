package com.koreait.first.loop;

public class For {

	public static void main(String[] args) {
		for (int i = 9; i > 4; i--) {
			System.out.println("Hi~~ ");
		}

		// A가 실행됨 (최초 1번만)
		// B > C > D (몇번 반복되냐는 그 안에 조건식에 따라 달려있음)

		System.out.println("-------------");

		// 50~100찍는 반복문 작성 0-50

		for (int i = 50; i <= 100; i++) {
			System.out.println(i - 50);
		}
	}

}
