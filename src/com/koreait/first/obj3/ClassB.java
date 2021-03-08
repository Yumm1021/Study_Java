package com.koreait.first.obj3;

public class ClassB extends ClassA {
	public ClassB(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void print() {
//		super.print(); // 부모에 있는 print를 여기서도 출력할 수 있음 예)A: B,20 출력됨
		System.out.println("B: " + getName() + "/" + getAge());
		// getName앞에 this.이나 super. 붙여도 값은 똑같이 나옴
	}
	
	public void drive() {
		System.out.println("driving!!");
	}
}