package com.koreait.first.obj; //객체화 

//메소드 > 호출
//비 보이드 문
// 객체 : 1)멤버 필드 2)멤버 메소드 > 두가지로 이루어져 있음 !!!!
// 멤버 필드가 외부에서는 안보임 > 은닉화 하는 이유 : 값이 바뀌면 안되기 때문, 값이 바뀌는 것을 막기 위해서
// 상수는 열어둠, 변수는 외부에서 다이렉트 

public class Car { // class 설계도 일 뿐이다. 문서일 뿐

	String name; // 멤버 필드 > 각 저장 담당 / 이름을 보통 명사로 지음
	int cc;
	String color; // String이라는 멤버필드는 객체형 , 대문자 시작 주소값 저장

	public void drive() { // 멤버 메소드 > 뭔가 움직임이 있는 거 / 이름을 보통 동사나 동사+명사로 지음
		System.out.printf("%s 색상의 %dcc의 %s 차량이 달린다.\n", color, cc, name);
	}
}
