package com.koreait.first.obj3;

public class OverrideTest {

	public static void main(String[] args) {
		ClassA ca = new ClassA("A", 10);
		ca.print();

		ClassB cb = new ClassB("B", 20);
		cb.print();

		ClassC cc = new ClassC("C", 30); // 호출할 때 일단 자기객체에서 먼저 찾음 
		// 자기 객체에 없으면 위로 올라가서 찾고 올라가서 찾음 대신 값은 자기값 출력
		cc.print();
	}

}