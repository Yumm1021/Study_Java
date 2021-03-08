package com.koreait.first.obj;

//어떤 소스든 class안에 있어야함
public class StaticTest1 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.country = "Korea";
		tv1.brand = "Samsung";
		tv1.inch = 50;

		tv1.printMe();

		Tv tv2 = new Tv();
		tv2.country = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;

		Tv.country = "France"; // 클래스 변수
		// 멤버필드 앞에 static을 붙이는 순간 무조건 한 값만 저장할 수 있음
		// tv로 만들어진 주소값으로도 접근할 수 있지만 "class명.변수명"으로 접근하는게 가장 좋다.
		// class명. 쓰는 것은 모두 static임
		// 대문자 . 쓰는 것은 아 ! static 이구나 알아야 함 메소드 앞에 가능한 static을 붙여라
		//

		tv2.printMe();
		tv1.printMe();
	}

}

class Tv { //멤버필드 세개 country, brand, inch
	static String country; // static은 class메모리 영역에 올라감
							// static 붙은 것들은 객체화가 필요 없고 , 없으면 new - 하면서 객체화를 해줘야함
							// static은 객체화가 필요없음 > 무조건 하나만 만듦 , 한 값만 저장함
							// 몇개를 만들어도 country라는 것은 하나임 > 몇개를 만들어도 하나만 참조

	String brand;
	int inch;

	/*
	 * static이 절대 못 쓰는 상황 
	 * 1. static이 안 붙은 멤버필드를 메소드 안에서 사용하게 되는 경우
	 */

	void printMe() { //메소드 만듦
		System.out.printf("%s나라의 %s회사의 %d인치 Tv입니다\n", country, brand, inch);
	} // 여기에 static이 붙으면 에러 뜸 왜 ? > brand와 inch는 static이 안 붙었기 때문에 에러가 뜨는 거임
		// brand와 inch가 쓰고 싶으면 객체화 하고 난 후에 static을 쓸 수 있다.

	static String whereCountry() {
		return country;
	}

	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}