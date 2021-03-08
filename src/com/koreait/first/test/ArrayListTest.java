package com.koreait.first.test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		int[] intArr = new int[0];
		// 이렇게 안하고 ArrayList는 그때그때 늘림

		al.add(1); // 기존의 길이를 복사해와서 +1씩 늘리는 것
		int[] temp = new int[intArr.length + 1];
		temp[0] = 1;
		intArr = temp;

		al.add(2);
		int[] temp2 = new int[intArr.length + 1]; // 새로 만들었기 때문에 0,0이 들어가있음
		// 기존에 있던 것 보다 1 커야함
		for (int i = 0; i < intArr.length; i++) {
			temp2[i] = intArr[i];
		}
		temp2[intArr.length] = 2;
		intArr = temp2;

		al.add(3);
		int[] temp3 = new int[intArr.length + 1]; // 새로 만들었기 때문에 0,0이 들어가있음
		// 기존에 있던 것 보다 1 커야함
		for (int i = 0; i < intArr.length; i++) {
			temp3[i] = intArr[i];
		}
		temp3[intArr.length] = 3;
		intArr = temp3;

		System.out.println("al - 0 : " + al.get(0));
		System.out.println("intArr - 0 : " + intArr[0]);
		System.out.println("al - 1 : " + al.get(1));
		System.out.println("intArr - 1 : " + intArr[1]);
		System.out.println("al - 2 : " + al.get(2));
		System.out.println("intArr - 2 : " + intArr[2]);
	}

}