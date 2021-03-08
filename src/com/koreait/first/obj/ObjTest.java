package com.koreait.first.obj;

public class ObjTest {

	public static void main(String[] args) {
		int num = 10; // 메소드 안에서 선언된 > 지역변수 mNum에 10을 넣음
						// 여기 num과 밑에 num은 다른 값을 가리킴

		NumberBox nbx = new NumberBox(); // 객체화 > nbx에 주소값 복사하여 줌
		// 대문자로 시작하는 것은 무조건 객체의 주소값을 의미
		// 여기 nbx와 밑에 pNbx는 다른 값을 가리킴
		nbx.num = 10; // 변수에 10을 넣어줌
		// nbx.str = "Hello";

		// changeVal2(nbx);
		changeVal(num); // 값을 복사하여 밑에 줌
		changeVal(nbx); // 값을 복사하여 밑에 줌

		System.out.println("num : " + num);
		System.out.println("nbx.num : " + nbx.num);
		// System.out.println("nbx.str : " + nbx.str);
	}

	// 오버로딩 > 파라미터만 다름
	public static void changeVal(int num) { // 파라미터가 다름 > 복사하여 여기에 줌
		num = 20; // 접근해서 주어지는 값이 없기 때문에 처음에 주어졌던 10만 출력이 됨 (내보냄)

	}

	public static void changeVal(NumberBox pNbx) { // 파라미터가 다름 > 존재는 다르지만 주소값은 같음
		 pNbx = new NumberBox(); // 이렇게 해버리면 pNbx값은 10이 출력됨 (내보냄)
		// 주소값이 달라지기 때문에 완전 다른 객체화가 됨 >
		// 처음 선언 받은 10이 출력(내보냄)
		pNbx.num = 20; // 처음에 주어졌던 값은 10이지만 pNbx.num이 접근해서 가리키는 값이 20이기 때문에
//						   처음 주어진 10 말고 20이 출력이 되는 것임 (내보냄)

	}
	// public static void changeVal2(NumberBox pNbx) {
	// pNbx.str = "ddd" //> str에 접근해서 ddd라는 값을 가리키고 있기 떄문에
//					      처음에 주어졌던 Hello 값 말고 가리키고 있는 값 ddd를 출력(내보냄)

}

class NumberBox { // 파일명과 똑같은 이름 명 앞에만 public을 붙일 수 있음
	int num;
	// String str;
}
