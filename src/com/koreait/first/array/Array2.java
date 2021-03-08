package com.koreait.first.array;

public class Array2 {

	public static void main(String[] args) {
		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 그 배열의 자리값에 넣어서 +1 한 값을 출력 , arr[i]값은 숫자 하나가 더 커야 하니까 i+1로 지정
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d: %d\n", i, arr[i]); // 맨 오른쪽은 호실이 가지고 있는 값

		}

		// 각 배열에 있는 값들을 모두 더한 값을 출력해주세요

		int result = 0; //무조건 for문 밖에 있어야함

		for (int i = 0; i < arr.length; i++) {
			result += arr[i]; // 1부터 20까지 모두 더하기 하는 식 result = result + arr[i]

		}

		System.out.println("합계 : " + result); // 출력

	}

}
