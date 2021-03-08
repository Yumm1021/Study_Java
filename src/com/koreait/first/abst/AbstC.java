package com.koreait.first.abst;

public abstract class AbstC extends AbstA {
	//A가 abstract을 가지고 있기 때문에 C 앞에도 abstract을 붙여야 함
	
	@Override
	public void print() {
		System.out.println("HI I'm C");
	}

}
