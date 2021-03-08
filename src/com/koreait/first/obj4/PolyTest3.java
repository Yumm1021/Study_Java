package com.koreait.first.obj4;

public class PolyTest3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();

		Animal ani = dog;
		System.out.println(ani instanceof Dog); // animal이 가리키고 있는 객체는 Dog
		// instanceof는 형변환이 가능하면 true, 불가능하면 false
		// 상속관계 부모타입이거나 자기와 같은 타입이면 true
		// 상속관계 자기보다 자식타입일 경우엔 false > 자식타입은 부모객체 주소값을 참조할 수 없으니까

		polyCry(dog);
		polyCry(cat);
		polyCry(bird);
	}

	public static void polyCry(Animal ani) { // 메소드 만들기
		// 타입이 Animal 이니까 타입 선언은 Animal로 해주는 것임

		ani.crying();
		if (ani instanceof Dog) { // dog 객체가 들어왔을 때만 true가 뜸
	/*		Dog dog = (Dog) ani; // dog니까 살랑 ~ 살랑 ~ 이 뜸 > (형변환 된 변수 사용)
			dog.shakeTail();
			*/
			
	((Dog) ani).shakeTail(); // 간단하게 나타내면 이렇게도 사용 가능 (형변환 안된 변수 사용)
		}
	}
}