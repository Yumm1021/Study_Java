package com.koreait.first.obj;

public class ObjTest5 { //

	public static void main(String[] args) {
		// 아래 NumberBox2를 객체화 하여
		// a = 10, b = 20을 넣고
		// sum() 메소드를 호출하여 리턴하는 값을 콘솔에 출력해주세요

		NumberBox2 nbx = new NumberBox2(); // 객체화 > nbx에 주소값 복사하여 줌
		nbx.a = 10; // 주소값 . > 그 친구가 가지고 있는 기능을 사용하게 됨
		nbx.b = 20; // 지금은 이 변수에 값을 담은 것
					// a와 b라는 변수에 각각 10과 20이라는 값을 담은 것

		NumberBox2 nbx2 = new NumberBox2(); // 객체 2개 만듦
		// nbx와 nbx2 각자 다른 값 저장
		nbx2.a = 33;
		nbx2.b = 44;

		System.out.println("nbx : " + nbx.sum()); // sum 메소드 호출
		System.out.println("nbx2 : " + nbx2.sum());

	}

}

class NumberBox2 { // class는 설계도와 같음
	int a;
	int b;

	int sum() { // sum 이라는 메소드는 복사 안됨
		return a + b;

	}
}