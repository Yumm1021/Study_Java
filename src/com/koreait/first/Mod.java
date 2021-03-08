package com.koreait.first;

public class Mod {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;

		System.out.println(n1 / n2); // 나누기
		System.out.println(n1 % n2); // 나눈 나머지값 구함

		int n3 = 8;
		int n4 = 7;
		int n5 = 6;
		int n6 = 5;

		System.out.println(n3 % 2);
		System.out.println(n4 % 2);
		System.out.println(n5 % 2);
		System.out.println(n6 % 2);

		// 1부터 30사이의 짝수값만 출력해주세요

		for (int i = 2; i <= 30; i++) {
			System.out.print(i % 2 == 0 ? i : ", ");
		}

//		for(int i=2; i<=30; i+=2) {
//			System.out.println(i);
//			
//			if(i < 30) {
//				System.out.println(", ");
//			}

//		for(int i=1; i<=30; i++) {
//			if(i % 2 == 0) {
//				System.out.print(i);
//				
//				if(i<30) {
//					System.out.println(", ");

//		for (int i = 1; i <= 30; i++) {
//			if (i == 1) {
//				continue;
//			}
//			System.out.print(i % 2 == 0 ? i : ", ");
//		}
//		System.out.println();
//	}

}
}
