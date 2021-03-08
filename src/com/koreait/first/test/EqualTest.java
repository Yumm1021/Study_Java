package com.koreait.first.test;

public class EqualTest {

	public static void main(String[] args) {
		ValueBox v1 = new ValueBox(10);
		ValueBox v2 = new ValueBox(10);

		//false
		System.out.println(v1 == v2); //== 은 주소값 비교 
		//true > 오버로딩해서 강제형변환 해줌
		System.out.println(v1.equals(v2));
	}

}