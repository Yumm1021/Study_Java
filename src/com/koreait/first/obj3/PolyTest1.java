package com.koreait.first.obj3;

public class PolyTest1 {

	public static void main(String[] args) {
		
		// 위쪽으로 형변환이 일어나고 있는 상황 > 업캐스팅 : 밑에 있는 것을 위로 올리는 것
		ClassB cb = new ClassB("B", 10);
		ClassA ca = cb; // 자동 형변환 > 어차피 부모는 자식 객체 참조할 수 있기 때문 "문제가 없기 때문"
		// cb가 가지고 있는 drive를 ca가 가질 수는 있지만 사용은 할 수 없음 ca에는 없기 때문에
		ca.print(); // a에 있는 print가 호출이 되는게 아니라 b에 있는 print가 호출 됨
		// 왜냐 ? Class가 B이기 때문에
		// **메소드만 기억하자**
		Object obj = ca;
		// 자기가 알고 있는 것만 호출 할 수 있음 > 타입 기준에서 메소드를 호출 할 수 있냐가 관건
		// 호출했다면 객체 기준에서 메소드가 실행됨

		// 밑쪽으로 내려간다 > 다운캐스팅
		// ClassA ca2 = obj; > obj는 뭘 가지고 있는지 모르기 때문에 에러가 남
		ClassA ca2 = (ClassA) obj; // 이렇게 강제로 형변환 해줘야함
		ca2.print();

//		String str = (String)ca2; // Class와 String은 남이기 때문에 안됨
		// 상속관계 일때만 가능

		ClassB cb2 = (ClassB) ca2;
		cb2.print();
		cb2.drive();
		// ClassA타입으로 호출했던 ClassB타입으로 호출했던 결과는 같음

	}

}
