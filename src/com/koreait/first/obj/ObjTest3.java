package com.koreait.first.obj;

import java.util.Arrays; // **!!괄호 갯수 잘 맞춰주기 !!**

// 정렬해서 맞추기
public class ObjTest3 {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 9, 3 };

		// arr을 정렬하는 orderBy메소드를 정의해 주세요.
		orderBy(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void orderBy(int[] arr) {
		// 소괄호 안에 들어갈 값은 무조건 !!위에 타입과 맞아야 함!!
		// 예) 타입이 int[] arr 이니까 괄호 안에도 int[] arr이 들어와야함
		// 무조건 class 안에 들어가서 작성해야 함 *괄호 주의*

		Arrays.sort(arr);
	}

}