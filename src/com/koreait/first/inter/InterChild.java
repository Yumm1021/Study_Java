package com.koreait.first.inter;

public interface InterChild extends InterParent { 
	//interface는 상속 가능함 , 추가적으로 추상메서드도 가능

	//interface는 구현부가 있는 메서드는 만들 수 없다
	//부모타입 역할만 하겠다 > 즉, 나를 상속하세요 
	//강제성 있음 > 나를 구현하시오 !
	//interface가 붙으면 객체화가 안됨 > 구현부가 없기 때문에 객체화가 안됨
	void bark();
}
