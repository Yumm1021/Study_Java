package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B", 10);
		ClassA ca = cb; // 여기서 호출 할 수 있는 건 ClassA에 있는 것만 호출 할 수 있다는 뜻
		// cb와 ca는 같은 걸 가리키고 있지만 ca에는 없기 때문에 drive 호출 못해
		Object obj = ca; // 모두 똑같은 객체의 주소값 가리키고 있음 ClassB ClassA Object
		// obj는 print라는 메소드가 없기 때문에 print 호출 못함
		// 아무리 그 메소드를 가지고 있더라도 내가 가지고 있진 않기 때문에 호출은 못함
		ca.print(); // 가지고 있기 때문에 호출은 할 수 있지만 실행되는 건 객체 기준이라 ClassA에 있는게
		// 호출 되는게 아니라 ClassB에 있는 메소드가 호출이 됨
		// 그래서 ca.print나 cb.print나 똑같음
		// **실제로 실행되는 건 객체 기준으로 실행이 된다 **

		
		// ClassA타입에 ca는 ClassA의 주소값도 가리킬 수 있지만
		// ClassB와 ClassC타입의 주소값도 가리킬 수 있다.

		// 부모타입으로 가면 갈수록 호출할 수 있는 메소드가 줄어듦
		// 자식은 메소드가 많아질 순 있어도 줄어들 순 없다.
		// 올라가면 올라갈수록 메소드가 줄어든다
		// ClassA 는 drive라는 메소드를 모른다 왜냐 ClassB에 있는 메소드니까
		// 아는 것만 호출 할 수 있음

		// ClassC cc = (ClassC)obj; 자식타입은 부모객체를 가리킬 수 없다.

	}

}
