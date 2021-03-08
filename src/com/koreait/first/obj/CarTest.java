package com.koreait.first.obj; //보이드 문

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car(); // 객체화 된 것 , new는 객체화 할 때 쓰는 키워드 , ()는 기본 생성자
		// 변수타입 > 신뢰성 , 어떤 타입이구나 하고 이미 안다
		// 대문자로 시작하는 문자는 !! 무조건 !! 주소값이다. 예) car1의 주소값은 Car
		car1.name = "페라리"; // car1에 .을 찍으면 class car에 있는 내용을 저장한다.
		car1.cc = 5000;
		car1.color = "붉은색";

		car1.drive(); // drive에 있는 내용을 실행해 ! 옆 비보이드 문에 > class에 저장된 내용 호출

		Car car2 = new Car();
		car2.name = "포르쉐";
		car2.cc = 3500;
		car2.color = "블랙";

		car2.drive();

		// == 이 들어갔을 때 주소값이 같으면 true , 주소값이 다르면 false가 출력된다
		// 예)System.out.println(car1 == car2) 는 주소값이 다르기 때문에 false가 출력된다.
	}

}
