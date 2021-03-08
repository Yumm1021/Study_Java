package com.koreait.first.abst;

public abstract class AbstA { //메서드 정의
	public abstract void bark(); //구현부가 없이 표현 가능
	//구현부가 없는 메서드를 만들고 싶다면 앞에 abstract를 붙여줘야 함 > 추상 메서드
	//**추상메서드를 가진 게 하나라도 있다면 class 앞에도 무조건 abstract을 붙여줘야함**
	//추상클래스는 **무조건**객체화를 할 수 없다 > 부모타입 역할만 할 수 있음
	
	//마치 abstract를 붙인 것 처럼 class를 객체화 못하게 하는 방법 : 기본 생성자를 private에 주면 됨
	//추상메서드를 가지고 있지 않아도 class 앞에 abstract을 붙일 수 있다
	//abstract이 붙어 있다면 절대 객체화를 못함
	//abstract > 강제성을 가지고 있음 **무조건 오버라이딩하라는 의미를 담고 있음**
	public void print() { //메서드의 선언부
		System.out.println("HI I'm A"); //메서드의 구현부
	}
}