package com.koreait.first.abst;

public class AbstB extends AbstA { //무조건 오버라이딩 해야하는 강제성을 가지고 있음

	@Override
	public void bark() { 
		System.out.println("멍멍!");
	}
	public void shakeTail() {
		System.out.println("살랑 ~ 살랑 ~ "); 
	}
}
