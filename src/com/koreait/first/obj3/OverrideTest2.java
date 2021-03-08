package com.koreait.first.obj3;

public class OverrideTest2 {

	public static void main(String[] args) {
		ClassA ca = new ClassB("B", 20); // > 부모타입은 자식객체 주소값 참조
	//	ClassB cb = new ClassA("A", 10); // > 자식타입은 부모객체 주소값 참조 안됨
		ca.print();
	//	ca.drive(); > 호출 못하는 이유 ? ClassA는 가지고 있지 않기 때문에 drive를 모름
		ClassB cb = (ClassB)ca; //이렇게 강제 형변환 해줘야함
		//기준은 **객체**
		//메소드를 호출할 수 있냐 없냐는 타입이 결정함
		cb.drive();
		
		ClassA ca2= (ClassA)cb; //자동 형변환되기 때문에 굳이 해줄 필요 없

	}
/* 다형성   !!굉장히 중요해!!
 * 1. 부모 타입은 자식 객체 참조할 수 있다(가리킬 수 있다) > 자식 객체 주소값 저장할 수 있다
 * 예) ClassA ca = new ClassB("B", 20);
 * ClassA입장에서는 ClassB는 자식 객체 , 다운캐스팅 되어 있는 상태 (자동으로 이루어짐)
 * 2. 자식 타입은 부모 객체 참조할 수 없다(가리킬 수 없다) > 부모 객체 주소값 저장할 수 없다
 * 예) ClassB cb = new ClassA("A", 10);
 * 3. 타입은 메소드를 호출할 수 있냐 없냐만 결정(즉, 자기가 알고 있는 메소드만 호출할 수 있다)
 *    실제로 실행되는 메소드는 **객체 기준**임 !!!!!!!
 * 예) ca.print();
 */
}