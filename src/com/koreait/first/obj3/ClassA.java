package com.koreait.first.obj3;

public class ClassA {

	private String name;
	private int age;

	public ClassA(String a, int b) { // 생성자를 통하여 private에 값을 넣을 수 있다
		System.out.println("ClassA 생성자");
		this.name = a;
		this.age = b;
//		this.print(); // this는 무조건 객체의 자기 자신 기준 > 호출하는 쪽이 this가 됨
		// 메소드는 무조건 객체 기준 , 이 this.print()를 A에 적어주면 A와 B를 다 출력하고
		// B에 적어주면 A는 안 나오고 B만 나옴
	}

	public void print() {
		System.out.println("A: " + name + ", " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}