package com.koreait.first.obj2;

public class Animal {
	String name;
	int age;

	public Animal() {
//		super(); // 기본 생성자 모양 > 컴파일러가 자동으로 생성자를 넣어줌 > super은 생략 가능함 
		
		this("바둑이"); //this() 는 생성자 호출
		
//		System.out.println("-- Animal 기본 생성자() --");
		
	} // 객체지향 언어는 무조건 호출 할 때 생성자를 호출해야 함
		// 생성자를 하나도 안 넣으면 컴파일러가 자동으로 기본 생성자를 만들어준다 생성자 > 메소드의 한 종류
		// 멤버필드 > 생성자 > 메소드 순서로 작성

	/*
	 * 메소드와 생성자가 다른 점 > 꼭 지켜줘야함 
	 * 1. 메소드 명이 클래스명과 똑같아야 함 <class뒤에 있는 명과 public 뒤에 있는 명>
	 * 2. return 타입이 없어야 함
	 * 3. 보통 생성자 앞에는 public 붙임
	 */
	
	// 생성자도 오버로딩이 가능함
	public Animal(String name) { //보냈을 때 무조건 기본생성자가 있어야함
		this(name, 2); //String값 하나만 보냈을 때도 이런 기본 생성자가 있어야함
	}
	
	public Animal(int age) {
		this("바둑이", age); //int값 하나만 보냈을 때도 이런 기본 생성자가 있어야함
	}
	
	public Animal(String name, int age) {
//		super(); > 기본 생성자 호출
		this.name = name; // this가 객체화가 되었다면 "나 자신의 주소값 . name"이 됨
				//전역변수와 지역변수가 이름이 같으면 사용을 하게 되면 제일 가까운 것을 씀
				//전역변수에 값을 넣는게 우리의 목적
		this.age = age;
		//this를 안 써도 되는 상황 > 변수명이 달랐을 때
		// 예) public Animal(String name, int d){
		// super();
		// this.name = name;
		// age = d;
		
	}
	

	public void crying() {
		System.out.printf("%d살의 %s가 운다.\n", age, name);
	}

}
