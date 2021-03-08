package com.koreait.first.obj4;

public class Animal extends Object {

	void crying() {
		System.out.println("운다");
	}

}

class Dog extends Animal {

	@Override
	void crying() {
		System.out.println("멍 ! 멍 !");
	}

	void shakeTail() {
		System.out.println("살랑 ~ 살랑 ~");
	}
}

//Dog 와 Cat 끼리는 형변환 안됨 > 형제끼리는 형변환 불가
class Cat extends Animal {
	@Override
	void crying() {
		System.out.println("야옹 ~ 야옹 ~");
	}
}

class Bird extends Animal {
	@Override
	void crying() {
		System.out.println("짹 ! 짹 !");
	}
}