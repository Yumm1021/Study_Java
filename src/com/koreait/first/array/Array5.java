package com.koreait.first.array;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		int[] arr = { 9, 7, 4, 5, 1, 3, 0 };

		for (int i = 0; i < arr.length - 1; i++) {
			int least = i; //최소값
			for (int j = i + 1; j < arr.length; j++) {  //최소값 찾아주는 거
				if (arr[least] > arr[j]) {
					least = j;
				}
			}

			if (i != least) { //자리 바꿈
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
