package com.koreait.first.abst;

public class AbstractTest {

	public static void main(String[] args) {
		AbstA aa = new AbstB(); //B는 abstract을 가지고 있지 않기 때문에 객체화 가능
		aa.bark(); //타입은 AbstA 이지만 B가 가지고 있기 때문에 멍멍이 출력이 된다.
		
		AbstB ab = (AbstB)aa; //강제 형변환
		ab.shakeTail();
		
		((AbstB)aa).shakeTail(); //이렇게 편하게도 할 수 있다.
	}

}