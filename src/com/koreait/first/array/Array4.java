package com.koreait.first.array;

import java.util.Arrays;

public class Array4 {
	// 버블 정렬
	public static void main(String[] args) {
		int[] arr = { 7, 4, 5, 1, 3 };

//		int temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp; // 7과 4 자리 바꾸는 방법

		System.out.println("시작: " + Arrays.toString(arr));

		for (int i = arr.length - 1; i > 0; i--) { // i--기 때문에 값이 계속 줄어든다
			for (int z = 0; z < i; z++) {
				if (arr[z] > arr[z + 1]) { //1이 옆에 있는 값 > z+1이 z값 보다 작다면 자리를 바꾸겠다.
					int temp = arr[z + 1];
					arr[z + 1] = arr[z];
					arr[z] = temp;  
				}
			}
			System.out.println(Arrays.toString(arr));
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ","); // 1, 3, 4, 5, 7이 나와야함
		}

	}

}
