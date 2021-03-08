package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest4 {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 9, 3 };
		int[] arr3 = arr; // 주소값만 복사하는 걸 !!얕은 복사!!를 칭함 <참조 복사라고도 함>
							// arr와 arr3는 같은 값을 가리킴

//		arr3[2] = 100;
//		arr[2] = 1000;
//		System.out.println(arr[2]);

//		System.out.println(arr3[2]);

		// 배열 복사하는 메소드 (깊은 복사)
		int[] arr2 = copyArr(arr); // 깊은 복사 > 똑같은 것을 하나 더 만든다고 생각하면 됨
									// 새로운 주소값을 만들어줘야함 > 무조건 객체화 한번 더 해줘야함

		// System.out.println(arr2[0]);
		// arr[0] = 77;
		// System.out.println(arr3[0]);
		// System.out.println(arr2[0]);

		orderBy(arr2); // return 받은 주소값 arr2의 값 정렬

		// 그렇기 때문에 다른 값을 만들 수 있다.arr은 누군가를 가질 수 있는 변수 일 뿐
		System.out.println(Arrays.toString(arr)); // [4, 7, 1, 9, 3]
		System.out.println(Arrays.toString(arr2));// [1, 3, 4, 7, 9]

	}

	public static void orderBy(int[] arr) {
		Arrays.sort(arr);
	}

	public static int[] copyArr(int[] arr) {
		// int[] arr2의 값을 위에서 arr의 값을 적어줘도 되지만 만약 숫자가 바뀐다면 할 때마다 수정해줘야 하니까
		// 이렇게 표현해주는 게 깔끔하고 편함 int[] arr2 = new int[arr.length];
		int[] arr2 = new int[arr.length]; // arr의 값을 가져와서 새로 정렬할 arr2의 값을 설정해줘야함
											// 새로운 주소값 만듦
		for (int i = 0; i < arr.length; i++) { // i값 지정
			arr2[i] = arr[i]; // 현재는 0으로 셋팅 되어 있는 arr2의 값을 arr값 내려받아 arr2값에 입력
		}

		return arr2; // arr2의 값 반환

	}
}
