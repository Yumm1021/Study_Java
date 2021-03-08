package com.koreait.first.obj2;

public class CapsuleTest {
	public static void main(String[] arg) {
		// 접근 지시어
		// private, default, protected, public
		// 외부로 부터 나에게 접근할 수 있는 권한을 줌

		Animal2 ani2 = new Animal2();
		ani2.setName("철철이");
		ani2.setAge(10);
		ani2.crying();

		String ani2Name = ani2.getName(); //외부에서 돌고 있는 값을 빼내는 방법
		int ani2Age = ani2.getAge();
		
		System.out.println(ani2Name); 
		System.out.println(ani2Age);
		
		// private : 같은 class 안에서만 접근 가능 > 상수는 값을 바꿀 수 없기 때문에 열어둬도 상관없다
		// default : 같은 class, package 안에서만 접근 가능 > 거의 잘 안씀
		// protected : 같은 class, package, 상속관계일 때 접근 가능
		// public : all 다 접근 가능 > 완전 공유
		// 변수 앞에 붙는 public과 class앞에 붙는 public은 의미가 다름
		// 실수 방지, 테스트 하는 범위가 달라지기 때문에 접근 지시어를 사용함
	}

}