package com.koreait.first.test;

import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.PrinterState;

public class ArrayListTest3 {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();

		list.add(100);
		list.add(200);
		list.add(1, 330);
		
		String result = list.toString() + "ddd";

		System.out.println(list);
		// object에서 toString을 가져옴
		// 재정의해서 **오버라이딩** 해줘야함 !!!!!!!
		System.out.println(list.toString()+"ddd");
		System.out.println(Arrays.toString(list.getArr()));
		System.out.println(list.remove(1));
		System.out.println(Arrays.toString(list.getArr()));

	}
}
