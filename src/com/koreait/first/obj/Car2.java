package com.koreait.first.obj;

public class Car2 {

	String name; // 멤버 필드 > 각 저장 담당 / 이름을 보통 명사로 지음
	int cc;
	String color;

	public void drive() { // 멤버 메소드 > 뭔가 움직임이 있는 거 / 이름을 보통 동사나 동사+명사로 지음
		System.out.printf("%s 색상의 %dcc의 %s 차량이 달린다.\n", color, cc, name);
	}
}
