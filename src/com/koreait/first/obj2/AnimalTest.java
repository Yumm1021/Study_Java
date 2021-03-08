package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani_1 = new Animal(); // 기본 생성자 호출
		 //new 라는 키워드로 Animal이 메모리에 올라감 > 메모리로 올라갈 때 생성자 호출
		// 생성자가 하나가 없을 때 기본 생성자를 넣어줌 > 컴파일 할 때
		// 기본값 > 바둑이의 2살
		ani_1.crying();
		
		
		
		Animal ani_2 = new Animal("나비", 3);
		ani_2.crying();
		
		Animal ani_3 = new Animal("달미");
		ani_3.crying();
		
		Animal ani_4 = new Animal(4);
		ani_4.crying();
	}

}