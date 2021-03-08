package com.koreait.first.obj;

public class CarTest2 {

	public static void main(String[] args) {
		Car car1 = new Car(); // 객체화 된 것 , new는 객체화 할 때 쓰는 키워드 , ()는 기본 생성자
		// 변수타입 > 신뢰성 , 어떤 타입이구나 하고 이미 안다
		// 대문자로 시작하는 문자는 !! 무조건 !! 주소값이다. 예) car1의 주소값은 Car
		car1.name = "페라리"; // car1에 .을 찍으면 class car에 있는 내용을 저장한다.
		car1.cc = 5000; // 변수에 바로 접근
		car1.color = "붉은색";

		Car car2 = new Car();
		car2.name = car1.name;
		car2.cc = car1.cc;
		car2.color = car1.color;

		car1 = car2; // car2가 가지고 있던 !!"주소값을 복사"!!하여 car1에 줌 > 출력 true 나옴
						// 이 순간부터 결과값은 같아짐
						// 주소값만 알면 접근 가능
						// 대문자로 시작하는 건 다 주소값을 가짐
						//같은 객체를 가리킴

		car1.name = "소나타"; // car1에 "소나타"를 줘도 어차피 car1과 car2는 동일하기 때문에
							// 둘다 소나타가 출력된다.

		car1.drive(); // drive에 있는 내용을 실행해 ! 옆 비보이드 문에 > class에 저장된 내용 호출
		car2.drive();

		System.out.println(car1 == car2);

		// == 이 들어갔을 때 주소값이 같으면 true , 주소값이 다르면 false가 출력된다
		// 예)System.out.println(car1 == car2) 는 주소값이 다르기 때문에 false가 출력된다.
		// 아무리 2라도 == 은 주소값 비교기 때문에 car1 == car2 하면 무조건 false가 출력된다.
		// Car1과 Car2가 가리키고 있는게 같냐를 봐야함 > Car1은 첫번째 만들어진 Car객체 참고
		// > Car2는 두번째 만들어진 Car객체 참고

	}

}
