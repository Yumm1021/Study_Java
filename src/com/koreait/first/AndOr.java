package com.koreait.first;

public class AndOr {

	public static void main(String[] args) {
		boolean r1 = true && true && true; //and 연산자 > 하나라도 false가 있으면 false
		System.out.println("r1:" + r1);
		
		boolean r2 = true && true && false; //true가 나올 거 같은 것을 맨 앞에 두는게 가장 유리 > and 연산자
		System.out.println("r2:" + r2);
		
		boolean r3 = true || false || false; //or 연산자 > 하나라도 true가 있으면 true
		System.out.println("r3:" + r3);
				
		boolean r4 = false || false || false; //false가 나올 거 같은 것을 맨 앞에 두는게 가장 유리 > or 연산자
		System.out.println("r4:" + r4);

	}

}
