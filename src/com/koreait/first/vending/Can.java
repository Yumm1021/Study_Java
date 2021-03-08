package com.koreait.first.vending;

public class Can {
	private final String nm; // 이름을 가지고
	private final int price; // 가격을 가짐

	// final은 생성자가 있어서 가능한거임

	// 객체가 만들어진 이후로 수정할 수 없게 하는 거 > 생성자와 getter만 있으면 됨, setter만 빼기

	public Can(String nm, int price) {
		this.nm = nm;
		this.price = price; // 생성자
	}

	public String getNm() {
		return nm;
	}

	
	public int getPrice() {
		return price;
	}

	
}